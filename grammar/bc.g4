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

expr : LEFTPAR expr RIGHTPAR
     | INCDEC varid=NAME
     | varid=NAME op=INCDEC
     | op=NEGATE a=expr
     | <assoc=right>a=expr op=POW b=expr
     | a=expr op=MULTIPLICATIVE b=expr
     | a=expr op=ADDITIVE b=expr
     | <assoc=right>varid=NAME op=PASSIGN b=expr
     | <assoc=right>varid=NAME op=ASSIGNMENT b=expr
     | a=expr op=RELATIONAL b=expr
     | op=NOT a=expr
     | a=expr op=AND b=expr
     | a=expr op=OR b=expr
     | number
     | varid=NAME
     // functions
     | funct=FUNCT  arg=expr RIGHTPAR
     | funct=NAME LEFTPAR arg=expr RIGHTPAR
     | READ LEFTPAR RIGHTPAR
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

INCDEC          :   ('++'|'--')                             ;
MULTIPLICATIVE  :   ('*'|'/'|'%')                           ;
NEGATE          :   '-'                                     ;
ADDITIVE        :   ('+'|NEGATE)                            ;
POW             :   '^'                                     ;
RELATIONAL      :   ('<'|'>'|'=='|'<='|'>='|'!=')           ;
AND             :   '&&'                                    ;
OR              :   '||'                                    ;
NOT             :   '!'                                     ;
PASSIGN         :   (MULTIPLICATIVE'='|ADDITIVE'='|POW'=')  ;
ASSIGNMENT      :   '='                                     ;

// rules
STRING  : STRINGDELIMITER .*? STRINGDELIMITER;

// terminals
STRINGDELIMITER : '"';