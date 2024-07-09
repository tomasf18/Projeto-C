grammar xagl;

program: stat* EOF;

stat:
	functions ';'
	| assignment ';'
	| instantiation ';'
	| for_loop
	| while_loop
	| if_stat;
 
functions:
	'refresh' ID ('after' time)?	# FunctionRefreshTime
	| 'move' ID 'by' (vector | ID | ID.ID)	# FunctionMoveVector
	| 'move' ID 'to' (point | ID | ID.ID)	# FunctionMovePoint;

assignment: ID '.' ID '=' expr # AssigmentObjectAttribute;

instantiation: ID '=' expr   # InstantiateObject; // Added

for_loop:
	'for' ID 'in' from_ = expr '..' to = expr 'do' '{' stat* '}' # ForRange; // MUDAR PARA expr

while_loop:
	'while' '('? expr ')'? 'do' '{' stat* '}' # WhileLoop;

if_stat:
	'if' '('? expr ')'? 'do' '{' stat* '}'							# IfStat
	| 'if' '('? expr ')'? 'do' '{' stat* '}' 'else' if_stat			# IfElseIf
	| 'if' '('? expr ')'? 'do' '{' stat* '}' 'else' '{' stat* '}'	# IfElseStat;

expr
	returns[String varName]:
	e1 = expr op = ('+' | '-') e2 = expr								# ExprAddSub // Altered
	| e1 = expr op = ('%' | '*' | '/') e2 = expr						# ExprMultDiv
	| sign = ('+' | '-') expr											# ExprUnaryOperator
	| '(' expr ')'														# ExprParenthesis
    | '!' expr															# ExprNot // Added
	| point																# ExprPoint
	| vector															# ExprVector
	| Number															# ExprNumber
	| String															# ExprString
	| ID																# ExprID
	| ID '.' ID															# ExprPropertyAccess
	| e1 = expr '&&' e2 = expr											# ExprBooleanAND
	| e1 = expr '||' e2 = expr											# ExprBooleanOR
	| e1 = expr op = ('==' | '!=' | '<' | '<=' | '>' | '>=') e2 = expr	# ExprBoolCompare
	| Boolean															# ExprBoolean;



time: expr ts = ('ms' | 's');

point: '(' expr ',' expr ')';

vector:
	point					# VectorPoint
	| '(' expr ':' expr ')'	# VectorPolar;

Number: [0-9]+ ('.' [0-9]+)?;

String: '"' .*? '"';

ID: [a-zA-Z_][a-zA-Z0-9_]*;

Boolean: 'True' | 'False';

COMMENT: '#' .*? NL -> skip;
MLCOMMENT: '#(' .*? '#)' -> skip;
WS: [ \t\r\n]+ -> skip;
NL: '\r'? '\n';