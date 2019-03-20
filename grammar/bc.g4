grammar bc;

// basic version, no branching control, functions, etc

program : <EOF>
        | (s=statement STATEMENT_DELIM+)*
        | statement*
        ;


statement : QUIT
          | expr
          | STRING
          | BRACELEFT statement_list BRACERIGHT
          | PRINT list
          | IF LEFTPAR expr RIGHTPAR statement (ELSE statement)?
          | WHILE LEFTPAR expr RIGHTPAR statement
          | FOR LEFTPAR expr SEMICOLON expr SEMICOLON expr RIGHTPAR statement
          | BREAK
          | CONTINUE
          | HALT
          | RETURN
          | RETURN ( LEFTPAR expr RIGHTPAR | expr ) // extension ver does not require parenthesis
          | DEFINE NAME LEFTPAR names_list? RIGHTPAR BRACELEFT auto_list? statement_list BRACERIGHT
          //| /* empty */
          ;

statement_list : curr=statement (STATEMENT_DELIM+ next=statement_list)
               | curr=statement
               | /* empty */
               ;

names_list : curr=NAME (LISTSEPARATOR next=names_list)? 
           ;

auto_list : AUTO names_list
          ;

list : curr=list_item (LISTSEPARATOR next=list)?
     ;

list_item : item=expr
          | STRING
          ;

expr : LEFTPAR expr RIGHTPAR                                # parenthesizedExpr
     | op=(INC | DEC) varid=NAME                            # incdecExpr
     | varid=NAME op=(INC | DEC)                            # incdecExpr
     | op=MIN a=expr                                        # unaryOpExpr
     | <assoc=right>a=expr op=POW b=expr                    # infixExpr
     | a=expr op=(MULT | DIV | MOD) b=expr                  # infixExpr
     | a=expr op=(ADD | MIN) b=expr                         # infixExpr
     | <assoc=right>varid=NAME op=PASSIGN b=expr            # pAssignExpr
     | <assoc=right>varid=NAME op=ASSIGNMENT b=expr         # assignExpr
     | a=expr op=(LT | GT | LTEQ | GTEQ | EQ | NEQ) b=expr  # infixExpr
     | op=NOT a=expr                                        # unaryOpExpr
     | a=expr op=AND b=expr                                 # infixExpr
     | a=expr op=OR b=expr                                  # infixExpr
     | value=number                                         # valueExpr
     | varid=NAME                                           # nameExpr
     // functions
     | funct=FUNCT LEFTPAR arg=expr RIGHTPAR                # functionCallExpr
     | funct=NAME LEFTPAR arg=expr RIGHTPAR                 # functionCallExpr
     | READ LEFTPAR RIGHTPAR                                # functionCallExpr
     ;

number : INT
       | FLOAT
       ;

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

LISTSEPARATOR   : ',';
STATEMENT_DELIM : (';' | '\n' | EOF) -> skip;

FUNCT   : (READ | SQRT | SINE | COSI | NLOG | EXPE);
READ    : 'read';
SQRT    : 'sqrt';
SINE    : 's';
COSI    : 'c';
NLOG    : 'l';
EXPE    : 'e';

// NAME begins with a letter followed by any number of letters, digits and underscores, all lowercase.

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