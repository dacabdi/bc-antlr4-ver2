grammar bc;

// basic version, no branching control, functions, etc

program : <EOF>
        | block <EOF>
        ;


statement : QUIT                                                                                                                # quitStat
          | expr                                                                                                                # exprStat
          | STRING                                                                                                              # stringStat
          | BRACELEFT block BRACERIGHT                                                                                          # statementBlockStat
          | PRINT list                                                                                                          # printStat
          | IF LEFTPAR expr RIGHTPAR statement (ELSE statement)?                                                                # ifElseStat
          | WHILE LEFTPAR expr RIGHTPAR statement                                                                               # whileStat
          | FOR LEFTPAR expr SEMICOLON expr SEMICOLON expr RIGHTPAR statement                                                   # forStat
          | BREAK                                                                                                               # breakStat
          | CONTINUE                                                                                                            # continueStat
          | HALT                                                                                                                # haltStat
          | RETURN                                                                                                              # returnStat
          | RETURN (( LEFTPAR expr RIGHTPAR ) | expr)                                                                           # returnStat
          | DEFINE name=NAME LEFTPAR params=names_list? RIGHTPAR BRACELEFT (AUTO autoList=names_list (';' | '\n')*)? body=block BRACERIGHT     # defineStat
          //| /* empty */
          ;

block : STATEMENT_DELIM* stat=statement (STATEMENT_DELIM+ stat=statement?)* STATEMENT_DELIM*
      | /* empty */
      ;

names_list : name=NAME (LISTSEPARATOR name=NAME)*
           ;

list : curr=list_item (LISTSEPARATOR next=list_item)*
     ;

list_item : item=expr
          | STRING
          ;

expr : LEFTPAR expr RIGHTPAR                                                    # parenthesizedExpr
     | op=(INC | DEC) varid=NAME                                                # incdecExpr
     | varid=NAME op=(INC | DEC)                                                # incdecExpr
     | op=MIN a=expr                                                            # unaryOpExpr
     | <assoc=right>a=expr op=POW b=expr                                        # infixExpr
     | a=expr op=(MULT | DIV | MOD) b=expr                                      # infixExpr
     | a=expr op=(ADD | MIN) b=expr                                             # infixExpr
     | <assoc=right>varid=NAME op=PASSIGN b=expr                                # pAssignExpr
     | <assoc=right>varid=NAME op=ASSIGNMENT b=expr                             # assignExpr
     | a=expr op=(LT | GT | LTEQ | GTEQ | EQ | NEQ) b=expr                      # infixExpr
     | op=NOT a=expr                                                            # unaryOpExpr
     | a=expr op=AND b=expr                                                     # infixExpr
     | a=expr op=OR b=expr                                                      # infixExpr
     | value=number                                                             # valueExpr
     | varid=NAME                                                               # nameExpr
     // functions
     | funct=NAME LEFTPAR args=args_list? RIGHTPAR                              # functionCallExpr
     | funct=(SQRT | SINE | COSI | NLOG | EXPE) LEFTPAR arg=expr RIGHTPAR       # functionCallExpr 
     | funct=READ LEFTPAR RIGHTPAR                                              # functionCallExpr
     ;

args_list : arg=expr (LISTSEPARATOR arg=expr)*                                  # visitArgumentsList
          ;

number : INT
       | FLOAT
       ;

// NAME begins with a letter followed by any number of letters, digits and underscores, all lowercase.

LISTSEPARATOR   : ',';
STATEMENT_DELIM : (SEMICOLON | '\n' );

IF : 'if';
ELSE : 'else';
LEFTPAR : '(';
RIGHTPAR : ')';
BRACELEFT : '{';
BRACERIGHT : '}';
PRINT : 'print';
QUIT : 'quit';
WHILE : 'while';
FOR : 'for';
SEMICOLON : ';';
BREAK : 'break';
CONTINUE : 'continue';
HALT : 'halt';
RETURN : 'return';
DEFINE : 'define';
AUTO : 'auto';

READ    : 'read';
SQRT    : 'sqrt';
SINE    : 's';
COSI    : 'c';
NLOG    : 'l';
EXPE    : 'e';

NAME        : (([a-z]+[_a-z0-9]*('['[0-9]+']'))|([a-z]+[_a-z0-9]*));
INT         : [0-9]+;
FLOAT       : [0-9]*'.'[0-9]*;
NEWLINE     : '\n';
COMMENT     : '/*'.*?'*/' -> skip;
WS          : [ \t\r]+ -> skip;

// OPERATORS--------------------------------------------------------------

// MULTIPLICATIVE
MULT : '*';
DIV  : '/';
MOD  : '%';
MIN  : '-';
ADD  : '+';
POW  : '^';

// INCDEC
INC : '++';
DEC : '--';

// RELATION
LT      : '<';
GT      : '>';
LTEQ    : '<=';
GTEQ    : '>=';
EQ      : '==';
NEQ     : '!=';

// LOGICAL
AND         : '&&';
OR          : '||';
NOT         : '!';

// ASSIGN
PASSIGN     : ((MULT | DIV | MOD)'='|(ADD | MIN)'='|POW'=');
ASSIGNMENT  : '=';

// rules
STRING  : STRINGDELIMITER .*? STRINGDELIMITER;

// terminals
STRINGDELIMITER : '"';