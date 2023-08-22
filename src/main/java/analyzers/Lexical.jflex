package analyzers;

import java_cup.runtime.*;
import java.util.LinkedList;
import errors.LexicalError;

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
%}

%init{
    lexicalErrors = new LinkedList<>();
    yyline = 1;
    yychar = 1;
%init}

BLANKS = [ \t\r]+
MULTILINE_COMMENT = "/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"
SIMPLE_COMMENT = "//" .*

DECIMAL = [0-9]+ "." [0-9]+
INTEGER = [0-9]+
TEXT = \" ([^\"] | "\\\"")+ \"
CHARACTER = \' ([^\'] | "\\\'") \'
BOOLEAN = true | false
ID = [a-zA-Z]+ | [a-zA-Z_][a-zA-Z0-9_]+

%%

"void"                  { return new Symbol(sym.VOID, yyline, (int)yychar, yytext()); }
"main"                  { return new Symbol(sym.MAIN, yyline, (int)yychar, yytext()); }
"if"                    { return new Symbol(sym.IF, yyline, (int)yychar, yytext()); }
"else"                  { return new Symbol(sym.ELSE, yyline, (int)yychar, yytext()); }
"switch"                { return new Symbol(sym.SWITCH, yyline, (int)yychar, yytext()); }
"case"                  { return new Symbol(sym.CASE, yyline, (int)yychar, yytext()); }
"break"                 { return new Symbol(sym.BREAK, yyline, (int)yychar, yytext()); }
"default"               { return new Symbol(sym.DEFAULT, yyline, (int)yychar, yytext()); }
"for"                   { return new Symbol(sym.FOR, yyline, (int)yychar, yytext()); }
"while"                 { return new Symbol(sym.WHILE, yyline, (int)yychar, yytext()); }
"do"                    { return new Symbol(sym.DO, yyline, (int)yychar, yytext()); }
"console"               { return new Symbol(sym.CONSOLE, yyline, (int)yychar, yytext()); }
"write"                 { return new Symbol(sym.WRITE, yyline, (int)yychar, yytext()); }

"int"                   { return new Symbol(sym.INT, yyline, (int)yychar, yytext()); }
"double"                { return new Symbol(sym.DOUBLE, yyline, (int)yychar, yytext()); }
"char"                  { return new Symbol(sym.CHAR, yyline, (int)yychar, yytext()); }
"bool"                  { return new Symbol(sym.BOOL, yyline, (int)yychar, yytext()); }
"string"                { return new Symbol(sym.STRING, yyline, (int)yychar, yytext()); }

"&&"                    { return new Symbol(sym.AND, yyline, (int)yychar, yytext()); }
"||"                    { return new Symbol(sym.OR, yyline, (int)yychar, yytext()); }
"!"                     { return new Symbol(sym.NOT, yyline, (int)yychar, yytext()); }
"+"                     { return new Symbol(sym.PLUS, yyline, (int)yychar, yytext()); }
"-"                     { return new Symbol(sym.MINUS, yyline, (int)yychar, yytext()); }
"*"                     { return new Symbol(sym.TIMES, yyline, (int)yychar, yytext()); }
"/"                     { return new Symbol(sym.DIVIDE, yyline, (int)yychar, yytext()); }
"++"                    { return new Symbol(sym.INCREASE, yyline, (int)yychar, yytext()); }
"--"                    { return new Symbol(sym.DECREASE, yyline, (int)yychar, yytext()); }
"("                     { return new Symbol(sym.LEFT_PARENTHESIS, yyline, (int)yychar, yytext()); }
")"                     { return new Symbol(sym.RIGHT_PARENTHESIS, yyline, (int)yychar, yytext()); }
"{"                     { return new Symbol(sym.LEFT_CURLY_BRACKET, yyline, (int)yychar, yytext()); }
"}"                     { return new Symbol(sym.RIGHT_CURLY_BRACKET, yyline, (int)yychar, yytext()); }
"["                     { return new Symbol(sym.LEFT_SQUARE_BRACKET, yyline, (int)yychar, yytext()); }
"]"                     { return new Symbol(sym.RIGHT_SQUARE_BRACKET, yyline, (int)yychar, yytext()); }
"<"                     { return new Symbol(sym.LESS_THAN, yyline, (int)yychar, yytext()); }
">"                     { return new Symbol(sym.GREATER_THAN, yyline, (int)yychar, yytext()); }
"<="                    { return new Symbol(sym.LESS_EQUAL, yyline, (int)yychar, yytext()); }
">="                    { return new Symbol(sym.GREATER_EQUAL, yyline, (int)yychar, yytext()); }
"="                     { return new Symbol(sym.EQUAL, yyline, (int)yychar, yytext()); }
"=="                    { return new Symbol(sym.EQUAL_TO, yyline, (int)yychar, yytext()); }
"!="                    { return new Symbol(sym.NOT_EQUAL_TO, yyline, (int)yychar, yytext()); }
"."                     { return new Symbol(sym.PERIOD, yyline, (int)yychar, yytext()); }
";"                     { return new Symbol(sym.SEMI_COLON, yyline, (int)yychar, yytext()); }
":"                     { return new Symbol(sym.COLON, yyline, (int)yychar, yytext()); }

\n                      { yychar = 1; }

{BLANKS}                {}
{MULTILINE_COMMENT}     { System.out.println(yytext()); }
{SIMPLE_COMMENT}        { System.out.println(yytext()); }

{DECIMAL}               { return new Symbol(sym.DECIMAL, yyline, (int)yychar, yytext()); }
{INTEGER}               { return new Symbol(sym.INTEGER, yyline, (int)yychar, yytext()); }
{TEXT}                  { return new Symbol(sym.TEXT, yyline, (int)yychar, yytext()); }
{CHARACTER}             { return new Symbol(sym.CHARACTER, yyline, (int)yychar, yytext()); }
{BOOLEAN}               { return new Symbol(sym.BOOLEAN, yyline, (int)yychar, yytext()); }
{ID}                    { return new Symbol(sym.ID, yyline, (int)yychar, yytext()); }

. {
    lexicalErrors.add(new LexicalError(yytext(), yyline, (int)yychar));
    System.out.println("Error lexico en: " + yytext() + ", Linea: " + yyline + ", Columna: " + yychar);
  }