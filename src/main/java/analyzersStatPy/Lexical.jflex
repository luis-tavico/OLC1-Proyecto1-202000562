package analyzersStatPy;

import java_cup.runtime.*;
import java.util.LinkedList;
import errors.LexicalError;
import tokens.Tokens;

%%

%class Lexical
%cupsym sym
%cup
%public
%full
%char
%unicode
%line
%column
%ignorecase

%{
    public LinkedList<LexicalError> lexicalErrors;
    public LinkedList<Tokens> tokens;
%}

%init{
    lexicalErrors = new LinkedList<>();
    tokens = new LinkedList<>();
    yyline = 1;
    yychar = 1;
%init}

BLANKS = [ \t\r]+
MULTILINE_COMMENT = "/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"
SIMPLE_COMMENT = "//" .*

DECIMAL = [0-9]+ "." [0-9]+
INTEGER = [0-9]+
TEXT = \" ([^\"] | "\\\"")* \"
CHARACTER = \' ([^\'] | "\\\'") \'
BOOLEAN = true | false
ID = [a-zA-Z]+ | [a-zA-Z_][a-zA-Z0-9_]+

%%

"void"                  { tokens.add(new Tokens(yytext(), "void", yyline, (int)yychar)); return new Symbol(sym.VOID, yyline, (int)yychar, yytext()); }
"main"                  { tokens.add(new Tokens(yytext(), "main", yyline, (int)yychar)); return new Symbol(sym.MAIN, yyline, (int)yychar, yytext()); }

"if"                    { tokens.add(new Tokens(yytext(), "if", yyline, (int)yychar)); return new Symbol(sym.IF, yyline, (int)yychar, yytext()); }
"else if"               { tokens.add(new Tokens(yytext(), "else_if", yyline, (int)yychar)); return new Symbol(sym.ELSEIF, yyline, (int)yychar, yytext()); }
"else"                  { tokens.add(new Tokens(yytext(), "else", yyline, (int)yychar)); return new Symbol(sym.ELSE, yyline, (int)yychar, yytext()); }
"switch"                { tokens.add(new Tokens(yytext(), "switch", yyline, (int)yychar)); return new Symbol(sym.SWITCH, yyline, (int)yychar, yytext()); }
"case"                  { tokens.add(new Tokens(yytext(), "case", yyline, (int)yychar)); return new Symbol(sym.CASE, yyline, (int)yychar, yytext()); }
"default"               { tokens.add(new Tokens(yytext(), "default", yyline, (int)yychar)); return new Symbol(sym.DEFAULT, yyline, (int)yychar, yytext()); }
"for"                   { tokens.add(new Tokens(yytext(), "for", yyline, (int)yychar)); return new Symbol(sym.FOR, yyline, (int)yychar, yytext()); }
"while"                 { tokens.add(new Tokens(yytext(), "while", yyline, (int)yychar)); return new Symbol(sym.WHILE, yyline, (int)yychar, yytext()); }
"do"                    { tokens.add(new Tokens(yytext(), "do", yyline, (int)yychar)); return new Symbol(sym.DO, yyline, (int)yychar, yytext()); }
"console"               { tokens.add(new Tokens(yytext(), "console", yyline, (int)yychar)); return new Symbol(sym.CONSOLE, yyline, (int)yychar, yytext()); }
"write"                 { tokens.add(new Tokens(yytext(), "write", yyline, (int)yychar)); return new Symbol(sym.WRITE, yyline, (int)yychar, yytext()); }
"return"                { tokens.add(new Tokens(yytext(), "return", yyline, (int)yychar)); return new Symbol(sym.RETURN, yyline, (int)yychar, yytext()); }
"break"                 { tokens.add(new Tokens(yytext(), "break", yyline, (int)yychar)); return new Symbol(sym.BREAK, yyline, (int)yychar, yytext()); }
"continue"              { tokens.add(new Tokens(yytext(), "continue", yyline, (int)yychar)); return new Symbol(sym.CONTINUE, yyline, (int)yychar, yytext()); }

"int"                   { tokens.add(new Tokens(yytext(), "int", yyline, (int)yychar)); return new Symbol(sym.INT, yyline, (int)yychar, yytext()); }
"double"                { tokens.add(new Tokens(yytext(), "double", yyline, (int)yychar)); return new Symbol(sym.DOUBLE, yyline, (int)yychar, yytext()); }
"char"                  { tokens.add(new Tokens(yytext(), "char", yyline, (int)yychar)); return new Symbol(sym.CHAR, yyline, (int)yychar, yytext()); }
"bool"                  { tokens.add(new Tokens(yytext(), "bool", yyline, (int)yychar)); return new Symbol(sym.BOOL, yyline, (int)yychar, yytext()); }
"string"                { tokens.add(new Tokens(yytext(), "string", yyline, (int)yychar)); return new Symbol(sym.STRING, yyline, (int)yychar, yytext()); }

"&&"                    { tokens.add(new Tokens(yytext(), "and", yyline, (int)yychar)); return new Symbol(sym.AND, yyline, (int)yychar, yytext()); }
"||"                    { tokens.add(new Tokens(yytext(), "or", yyline, (int)yychar)); return new Symbol(sym.OR, yyline, (int)yychar, yytext()); }
"!"                     { tokens.add(new Tokens(yytext(), "not", yyline, (int)yychar)); return new Symbol(sym.NOT, yyline, (int)yychar, yytext()); }
"+"                     { tokens.add(new Tokens(yytext(), "mas", yyline, (int)yychar)); return new Symbol(sym.PLUS, yyline, (int)yychar, yytext()); }
"-"                     { tokens.add(new Tokens(yytext(), "menos", yyline, (int)yychar)); return new Symbol(sym.MINUS, yyline, (int)yychar, yytext()); }
"*"                     { tokens.add(new Tokens(yytext(), "multiplicado", yyline, (int)yychar)); return new Symbol(sym.TIMES, yyline, (int)yychar, yytext()); }
"/"                     { tokens.add(new Tokens(yytext(), "dividido", yyline, (int)yychar)); return new Symbol(sym.DIVIDE, yyline, (int)yychar, yytext()); }
"++"                    { tokens.add(new Tokens(yytext(), "incremento", yyline, (int)yychar)); return new Symbol(sym.INCREASE, yyline, (int)yychar, yytext()); }
"--"                    { tokens.add(new Tokens(yytext(), "decremento", yyline, (int)yychar)); return new Symbol(sym.DECREASE, yyline, (int)yychar, yytext()); }
"("                     { tokens.add(new Tokens(yytext(), "parentesis_abierto", yyline, (int)yychar)); return new Symbol(sym.LEFT_PARENTHESIS, yyline, (int)yychar, yytext()); }
")"                     { tokens.add(new Tokens(yytext(), "parentesis_cerrado", yyline, (int)yychar)); return new Symbol(sym.RIGHT_PARENTHESIS, yyline, (int)yychar, yytext()); }
"{"                     { tokens.add(new Tokens(yytext(), "llave_abierta", yyline, (int)yychar)); return new Symbol(sym.LEFT_CURLY_BRACKET, yyline, (int)yychar, yytext()); }
"}"                     { tokens.add(new Tokens(yytext(), "llave_cerrada", yyline, (int)yychar)); return new Symbol(sym.RIGHT_CURLY_BRACKET, yyline, (int)yychar, yytext()); }
"["                     { tokens.add(new Tokens(yytext(), "corchete_abierto", yyline, (int)yychar)); return new Symbol(sym.LEFT_SQUARE_BRACKET, yyline, (int)yychar, yytext()); }
"]"                     { tokens.add(new Tokens(yytext(), "corchete_cerrado", yyline, (int)yychar)); return new Symbol(sym.RIGHT_SQUARE_BRACKET, yyline, (int)yychar, yytext()); }
"<"                     { tokens.add(new Tokens(yytext(), "menor_que", yyline, (int)yychar)); return new Symbol(sym.LESS_THAN, yyline, (int)yychar, yytext()); }
">"                     { tokens.add(new Tokens(yytext(), "mayor_que", yyline, (int)yychar)); return new Symbol(sym.GREATER_THAN, yyline, (int)yychar, yytext()); }
"<="                    { tokens.add(new Tokens(yytext(), "menor_igual", yyline, (int)yychar)); return new Symbol(sym.LESS_EQUAL, yyline, (int)yychar, yytext()); }
">="                    { tokens.add(new Tokens(yytext(), "mayor_igual", yyline, (int)yychar)); return new Symbol(sym.GREATER_EQUAL, yyline, (int)yychar, yytext()); }
"="                     { tokens.add(new Tokens(yytext(), "igual", yyline, (int)yychar)); return new Symbol(sym.EQUAL, yyline, (int)yychar, yytext()); }
"=="                    { tokens.add(new Tokens(yytext(), "igual_que", yyline, (int)yychar)); return new Symbol(sym.EQUAL_TO, yyline, (int)yychar, yytext()); }
"!="                    { tokens.add(new Tokens(yytext(), "distinto_que", yyline, (int)yychar)); return new Symbol(sym.NOT_EQUAL_TO, yyline, (int)yychar, yytext()); }
"."                     { tokens.add(new Tokens(yytext(), "punto", yyline, (int)yychar)); return new Symbol(sym.PERIOD, yyline, (int)yychar, yytext()); }
","                     { tokens.add(new Tokens(yytext(), "coma", yyline, (int)yychar)); return new Symbol(sym.COMMA, yyline, (int)yychar, yytext()); }
";"                     { tokens.add(new Tokens(yytext(), "punto_coma", yyline, (int)yychar)); return new Symbol(sym.SEMI_COLON, yyline, (int)yychar, yytext()); }
":"                     { tokens.add(new Tokens(yytext(), "dos_puntos", yyline, (int)yychar)); return new Symbol(sym.COLON, yyline, (int)yychar, yytext()); }
"$"                     { tokens.add(new Tokens(yytext(), "dolar", yyline, (int)yychar)); return new Symbol(sym.DOLLAR, yyline, (int)yychar, yytext()); }

\n                      { yychar = 1; }

{BLANKS}                {}
{MULTILINE_COMMENT}     { System.out.println(yytext()); }
{SIMPLE_COMMENT}        { System.out.println(yytext()); }

{DECIMAL}               { tokens.add(new Tokens(yytext(), "decimal", yyline, (int)yychar)); return new Symbol(sym.DECIMAL, yyline, (int)yychar, yytext()); }
{INTEGER}               { tokens.add(new Tokens(yytext(), "entero", yyline, (int)yychar)); return new Symbol(sym.INTEGER, yyline, (int)yychar, yytext()); }
{TEXT}                  { tokens.add(new Tokens(yytext(), "cadena", yyline, (int)yychar)); return new Symbol(sym.TEXT, yyline, (int)yychar, yytext()); }
{CHARACTER}             { tokens.add(new Tokens(yytext(), "caracter", yyline, (int)yychar)); return new Symbol(sym.CHARACTER, yyline, (int)yychar, yytext()); }
{BOOLEAN}               { tokens.add(new Tokens(yytext(), "boolean", yyline, (int)yychar)); return new Symbol(sym.BOOLEAN, yyline, (int)yychar, yytext()); }
{ID}                    { tokens.add(new Tokens(yytext(), "identificador", yyline, (int)yychar)); return new Symbol(sym.ID, yyline, (int)yychar, yytext()); }

. {
    lexicalErrors.add(new LexicalError(yytext(), yyline, (int)yychar));
  }