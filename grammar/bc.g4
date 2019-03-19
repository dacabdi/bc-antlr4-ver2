grammar bc;

// basic version, no branching control, functions, etc

program : <EOF>
        | statement_feed_list
        ;

statement_feed_list : statement_feed* EOF; 

statement_feed : s=statement STATEMENT_DELIM+
               ; //STATEMENT_DELIM+ //(?=[ \t\r\n;]*)
            
statement : 'quit'
          | expr
          | STRING
          | '{' statement_list '}'
          | 'print' list
          | /* empty */
          ;

statement_list : curr=statement (STATEMENT_DELIM next=statement_list)
               | curr=statement
               | /* empty */
               ;

list : curr=list_item (LISTSEPARATOR next=list)
     | curr=list_item
     | /* empty */
     ;

list_item : item=expr
          | STRING
          ;

expr : '(' expr ')'
     | op=INCDEC varid=VAR
     | varid=VAR op=INCDEC
     | op=NEGATE a=expr
     | <assoc=right>a=expr op=POW b=expr
     | a=expr op=MULTIPLICATIVE b=expr
     | a=expr op=ADDITIVE b=expr
     | <assoc=right>varid=VAR op=PASSIGN b=expr
     | <assoc=right>varid=VAR op=ASSIGNMENT b=expr
     | a=expr op=RELATIONAL b=expr
     | op=NOT a=expr
     | a=expr op=AND b=expr
     | a=expr op=OR b=expr
     | number
     | varid=VAR
     | f=FUNCT '(' arg=expr ')'
     | READ '(' ')'
     ;

number : INT
       | FLOAT
       ;

LISTSEPARATOR   : ',';
STATEMENT_DELIM : ('\n' | ';' | EOF);

FUNCT   : (READ | SQRT | SINE | COSI | NLOG | EXPE);
READ    : 'read';
SQRT    : 'sqrt';
SINE    : 's';
COSI    : 'c';
NLOG    : 'l';
EXPE    : 'e';

// Names begin with a letter followed by 
// any number of letters, digits and underscores.
VAR         : (([a-z]+[_a-z0-9]*('['[0-9]+']'))|([a-z]+[_a-z0-9]*));
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