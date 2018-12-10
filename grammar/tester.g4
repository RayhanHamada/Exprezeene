grammar tester;

TO_SKIP
    : ([\t\r\n] | ' ') -> skip
    ;
IDENTIFIER
    : [A-Za-z_] [A-Za-z0-9_]*
    ;

methodCall
    : IDENTIFIER '(' ')'
    ;


expr
	:   methodCall //function call
	|	IDENTIFIER  //variables
	|   '.' IDENTIFIER //var member access
	|   '.' methodCall //method member access
	|	'(' expr ')'  //grouping with parentheses
	|	('+' | '-') expr	//unary plus/minus
	|	expr ('/' | '*') expr	//explicit division/multiplication
	|	expr ('+' | '-') expr	//addition/subtraction
	;

stat
    : expr+
    ;
