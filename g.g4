grammar g;
prule: start;
start: parenthesis | start ' U ' parenthesis ;
parenthesis: value | '('start')' | '('start')'outerParenthesis;
value: charArray | 'E';
outerParenthesis: Symbol | Symbol charArray;
charArray: charAndSymbol | charArray charAndSymbol;
charAndSymbol: Char | Char Symbol;
Char: 'a'..'z'|'0'..'9';
Symbol: '*' | '+' | '?';
/*
Expr: Parenthesis ExprRecur;
ExprRecur: (' U ' Parenthesis ExprRecur)?;
Parenthesis: Value | '('Expr')' | '('Expr')' Outer;
Value: CharArray | 'E';
Outer: Symbol | Symbol CharArray;
CharArray: Char CharRecur;
CharRecur: (Char CharRecur);
Symbol: '*' | '+' | '?';
Char:'a'..'z'|'0'..'9';
*/

//S: C T;
//T:(' U ' C T)?;
//C: R | '('S')' | '('S')'O;
//R: N | 'E';
//O: X | X N;
//N: D L;
//L: (D N)?;
//D: A | A X;
//A: 'a'..'z'|'0'..'9';
//X: '*' | '+' | '?';

//S: S 'U' C| C;
//C: R | (S) | (S)O;
//R: N | 'E';
//O: X | N;
//N: N D | D;
//D: A | A X;
//A: 'a'..'z' | '0'..'9';
//X: '*' | '+' |'?';