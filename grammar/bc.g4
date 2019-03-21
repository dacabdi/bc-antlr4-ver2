grammar bc;

// basic version, no branching control, functions, etc

program : <EOF>
        | block <EOF>
        ;


statement : QUIT                                                                                                                # quitStat
          | value=expr                                                                                                                # exprStat
          | STRING                                                                                                              # stringStat
          | BRACELEFT block BRACERIGHT                                                                                          # statementBlockStat
          | PRINT list_item (LISTSEPARATOR list_item)*                                                                          # printStat
          | IF LEFTPAR condition=expr RIGHTPAR STATEMENT_DELIM* if_block=statement STATEMENT_DELIM* (ELSE STATEMENT_DELIM* else_block=statement)?   # ifElseStat
          | WHILE LEFTPAR condition=expr RIGHTPAR STATEMENT_DELIM* body=statement                                                                   # whileStat
          | FOR LEFTPAR init=expr STATEMENT_DELIM condition=expr STATEMENT_DELIM maintenance=expr RIGHTPAR STATEMENT_DELIM* body=statement                      # forStat
          //| BREAK                                                                                                             # breakStat
          //| CONTINUE                                                                                                          # continueStat
          //| HALT                                                                                                              # haltStat
          | RETURN                                                                                                              # returnStat
          | RETURN (( LEFTPAR value=expr RIGHTPAR ) | value=expr)                                                                           # returnStat
          | DEFINE name=NAME LEFTPAR params=names_list? RIGHTPAR STATEMENT_DELIM* BRACELEFT STATEMENT_DELIM* (AUTO autoList=names_list STATEMENT_DELIM+)? body=block BRACERIGHT # defineStat
          //| /* empty */
          ;

block : STATEMENT_DELIM* stat=statement (STATEMENT_DELIM+ stat=statement?)* STATEMENT_DELIM*
      | /* empty */
      ;

names_list : name=NAME (LISTSEPARATOR name=NAME)*
           ;

list_item : expr 
          | STRING
          ;

expr : LEFTPAR value=expr RIGHTPAR                                                    # parenthesizedExpr
     | op=(INC | DEC) varid=varname                                             # preIncdecExpr
     | varid=varname op=(INC | DEC)                                             # postIncdecExpr
     | op=MIN a=expr                                                            # unaryOpExpr
     | <assoc=right>a=expr op=POW b=expr                                        # infixExpr
     | a=expr op=(MULT | DIV | MOD) b=expr                                      # infixExpr
     | a=expr op=(ADD | MIN) b=expr                                             # infixExpr
     | <assoc=right>varid=varname op=PASSIGN b=expr                             # pAssignExpr
     | <assoc=right>varid=varname op=ASSIGNMENT b=expr                          # assignExpr
     | a=expr op=(LT | GT | LTEQ | GTEQ | EQ | NEQ) b=expr                      # infixExpr
     | op=NOT a=expr                                                            # unaryOpExpr
     | a=expr op=AND b=expr                                                     # infixExpr
     | a=expr op=OR b=expr                                                      # infixExpr
     | value=number                                                             # valueExpr
     | varname                                                                  # varnameExpr
     // functions
     | funct=NAME LEFTPAR (expr (LISTSEPARATOR expr)*)?  RIGHTPAR               # functionCallExpr
     | funct=(SQRT | SINE | COSI | NLOG | EXPE) LEFTPAR arg=expr RIGHTPAR       # functionCallExpr 
     | funct=READ LEFTPAR RIGHTPAR                                              # functionCallExpr
     ;

varname : name=NAME                                                            # nameExpr
        | name=NAME SQBRACKLEFT index=expr SQBRACKRIGHT                        # arrayExpr
        ;

number : INT
       | FLOAT
       ;

// NAME begins with a letter followed by any number of letters, digits and underscores, all lowercase.

LISTSEPARATOR   : ',';
STATEMENT_DELIM : (SEMICOLON | '\n' );
SEMICOLON : ';';

IF : 'if';
ELSE : 'else';
LEFTPAR : '(';
RIGHTPAR : ')';
BRACELEFT : '{';
BRACERIGHT : '}';
SQBRACKLEFT : '[';
SQBRACKRIGHT : ']';
PRINT : 'print';
QUIT : 'quit';
WHILE : 'while';
FOR : 'for';

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

NAME        : [a-z]+[a-z0-9_]*;
//NAME        : (([a-z]+[_a-z0-9]*('['[0-9]+']'))|([a-z]+[_a-z0-9]*));
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