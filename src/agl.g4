grammar agl;

/************************************************************************/
/* Base Program                                                          */
program: stat* EOF;
stat:
	'{' stat* '}'
	| instantiation ';'
	| assignment
	| functions
	| view
	| graphicalObject
	| for_loop
	| if_stat
	| while_loop
	| modelInstantiation;
/* END Base Program                                                      */
/************************************************************************/

/************************************************************************/
/* Assignments                                                           */
assignment:
	ID '=' expr ';'									# AssignmentExisting
	| instantiation '=' expr ';'					# AssignmentInstatiation
	| ID '.' ID '=' expr ';'						# AssignmentObjectAttribute
	| instantiation '=' event ';'					# AssignmentEvents 
	| ID '[' index = expr ']' '=' value = expr ';'	# AssignmentArray;

instantiation
	returns[String varName]: varID = ID ':' type;
/* END Assignments                                                       */
/************************************************************************/

/************************************************************************/
/* Operations                                                            */
functions:
	'close' ID ';'										# FunctionClose
	| 'refresh' ID ('after' time)? ';'					# FunctionRefresh
	| 'print' expr ';'									# FunctionPrint 
	| 'move' expr s = ('by' | 'to') point ';'			# FunctionMoveVector
	| 'move' expr s = ('by' | 'to') vectorID = ID ';'	# FunctionMoveID
	| 'play' ID 'with' '{' (assignment)* '}'			# FunctionPlayScript ; 

expr
	returns[String varName]:
	sign = ('-' | '+') expr											# ExprUnaryOperator
	| <assoc = right> e1 = expr '^' e2 = expr						# ExprPow
	| e1 = expr op = ('*' | '/' | '%') e2 = expr					# ExprMultDiv
	| e1 = expr op = ('+' | '-') e2 = expr							# ExprAddSub
	| '(' expr ')'													# ExprParenthesis
	| Boolean														# ExprBoolean
	| events														# ExprEvent
	| point															# ExprPoint
	| vector														# ExprVector
	| Integer														# ExprInteger
	| Number														# ExprRealNumber
	| String														# ExprString
	| ID															# ExprID
	| '!' expr														# ExprNotBoolean
	| e1 = expr ('==' | '!=' | '<' | '<=' | '>' | '>=') e2 = expr	# ExprBoolCompare
	| e1 = expr '&&' e2 = expr										# ExprBooleanAND
	| e1 = expr '||' e2 = expr										# ExprBooleanOR
	| '[' (expr (',' expr)*)? ']'									# ExprArray
	| ID '[' index = expr ']'										# ExprArrayAccess;

events
	returns[String varName]: 'wait' event;

event
	returns[String varName]:
	'mouse click'		# EventMouseClick
	| 'input' String?	# EventReadInput
	| 'load' String		# EventLoadFile;
/* END Operations                                                        */
/************************************************************************/

/************************************************************************/
/* Graphical context                                                     */
graphicalObject
	returns[String varName]:
	// If in model must save variable.object
	objectType 'at' point 'with' '{' (assignment)* '}'				# GraphicalObjectIDCoords
	| instantiation 'at' point 'with' '{' (assignment)* '}'			# GraphicalObjectInstatiationCoords
	| objectType 'at' pointID = ID 'with' '{' (assignment)* '}'		# GraphicalObjectID
	| instantiation 'at' pointID = ID 'with' '{' (assignment)* '}'	# GraphicalObjectInstatiationID
	| 'with' object 'do' '{' (assignment)* '}'						# GraphicalObjectUpdate
	| instantiation 'at' pointID = ID ';'							# GraphicalObjectModelInstantiationID
	| instantiation 'at' point ';'									# GraphicalObjectModelInstantiationCoords
	| objectType 'at' pointID = ID ';'								# GraphicalObjectModelID
	| objectType 'at' point ';'										# GraphicalObjectModelIDCoords
	| action														# GraphicalObjectAction
	| modelID = ID ':' 'Enum' 'in' '{' (ID (',' ID)*) '}'			# GraphicalObjectAssignmentEnum;
action: 'action' 'on' ID '{' actionIf+ '}';
actionIf:
	'if' ID '==' ID 'do' stat											# ActionIfStat
	| 'if' ID '==' ID 'do' stat 'else' actionIf							# ActionIfElseIf
	| 'if' ID '==' ID 'do' ifBlock = stat 'else' 'do' elseBlock = stat	# ActionIfElseStat;
modelInstantiation:
	modelID = ID '::' 'Model' '{' graphicalObject+ '}';

view: instantiation 'with' '{' (assignment)* '}';

object
	returns[String varName]:
	ID				# ObjectGraphical
	| object '.' ID	# ObjectModel;

/* Scripting  */

/* END Graphical context                                                 */
/************************************************************************/

/************************************************************************/
/* LOOPS                                                                 */
if_stat:
	'if' expr 'do' stat												# IfStat
	| 'if' expr 'do' stat 'else' if_stat							# IfElseIf
	| 'if' expr 'do' ifBlock = stat 'else' 'do' elseBlock = stat	# IfElseStat;

while_loop: 'while' expr 'do' stat # WhileLoop;

for_loop:
	'for' ID 'in' from = expr '..' to = expr ('..' step = expr)? 'do' stat	# ForRange
	| 'for' ID 'in' expr 'do' stat											# ForEachRange // Falta verificação semantica
    ; 
/* END LOOPS                                                             */
/************************************************************************/

/************************************************************************/
/* Primitives Data Types                                                 */
time: expr ts = ('ms' | 's');

type:
	'Integer'
	| 'Number'
	| 'Point'
	| 'Vector'
	| 'String'
	| 'Array'
	| 'Script'
	| 'Boolean'
	| objectType;

objectType:
	'View'
	| 'Dot'
	| 'Line'
	| 'Rectangle'
	| 'Ellipse'
	| 'Text'
	| 'Arc'
	| 'ArcChord'
	| 'PieSlice'
	| 'Polyline'
	| 'Spline'
	| 'Polygon'
	| 'Blob'
	| ID ; // user defined models

point: '(' x1 = expr ',' x2 = expr ')';
vector:
	point					# VectorPoint
	| '(' expr ':' expr ')'	# VectorPolar;

Boolean: 'True' | 'False';
Integer: [0-9]+;
Number: [0-9]+ ('.' [0-9]+)?;
String: '"' .*? '"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
/* END Primitives Data Types                                             */
/************************************************************************/

/************************************************************************/
/* COMMENTS & WhiteSpace & Error                                         */
COMMENT: '#' .*? (NL | EOF) -> skip;
MLCOMMENT: '#(' .*? '#)' -> skip;
WS: [ \t\r\n] -> skip;
NL: '\r'? '\n';
ERROR: .;
/* END COMMENTS & WhiteSpace & Error                                     */
/************************************************************************/