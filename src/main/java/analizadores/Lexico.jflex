package analizadores;

import java_cup.runtime.*;
import java.util.LinkedList;
import errors.LexicalError;

%%

%class Lexico
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

ESPACIOS = [ \t\r]+
COMENTARIO_MULTILINEA = "/*""/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/"
COMENTARIO_LINEAL = "//" .*

DECIMAL = [0-9]+ "." [0-9]+
ENTERO = [0-9]+
CADENA = \" ([^\"] | "\\\"")+ \"
CARACTER = \' ([^\'] | "\\\'") \'
BOOLEANO = true | false
IDENTIFICADOR = [a-zA-Z]+ | [a-zA-Z_][a-zA-Z0-9_]+

%%

"void"                  { return new Symbol(sym.TIPO_RETORNO, yyline, (int)yychar, yytext()); }
"if"                    { return new Symbol(sym.IF, yyline, (int)yychar, yytext()); }
"elif"                  { return new Symbol(sym.ELIF, yyline, (int)yychar, yytext()); }
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
"++"                    { return new Symbol(sym.INCREMENTO, yyline, (int)yychar, yytext()); }
"--"                    { return new Symbol(sym.DECREMENTO, yyline, (int)yychar, yytext()); }
"=="                    { return new Symbol(sym.IGUAL_QUE, yyline, (int)yychar, yytext()); }
"!="                    { return new Symbol(sym.DISTINTO_QUE, yyline, (int)yychar, yytext()); }
"<="                    { return new Symbol(sym.MENOR_IGUAL, yyline, (int)yychar, yytext()); }
">="                    { return new Symbol(sym.MAYOR_IGUAL, yyline, (int)yychar, yytext()); }
"("                     { return new Symbol(sym.PARENTESIS_ABIERTO, yyline, (int)yychar, yytext()); }
")"                     { return new Symbol(sym.PARENTESIS_CERRADO, yyline, (int)yychar, yytext()); }
"{"                     { return new Symbol(sym.LLAVE_ABIERTA, yyline, (int)yychar, yytext()); }
"}"                     { return new Symbol(sym.LLAVE_CERRADA, yyline, (int)yychar, yytext()); }
"["                     { return new Symbol(sym.CORCHETE_ABIERTO, yyline, (int)yychar, yytext()); }
"]"                     { return new Symbol(sym.CORCHETE_CERRADO, yyline, (int)yychar, yytext()); }
"<"                     { return new Symbol(sym.MENOR, yyline, (int)yychar, yytext()); }
">"                     { return new Symbol(sym.MAYOR, yyline, (int)yychar, yytext()); }
"="                     { return new Symbol(sym.IGUAL, yyline, (int)yychar, yytext()); }
"+"                     { return new Symbol(sym.MAS, yyline, (int)yychar, yytext()); }
"-"                     { return new Symbol(sym.MENOS, yyline, (int)yychar, yytext()); }
"*"                     { return new Symbol(sym.ASTERISCO, yyline, (int)yychar, yytext()); }
"/"                     { return new Symbol(sym.DIAGONAL, yyline, (int)yychar, yytext()); }
"."                     { return new Symbol(sym.PUNTO, yyline, (int)yychar, yytext()); }
","                     { return new Symbol(sym.COMA, yyline, (int)yychar, yytext()); }
";"                     { return new Symbol(sym.PUNTO_COMA, yyline, (int)yychar, yytext()); }
":"                     { return new Symbol(sym.DOS_PUNTOS, yyline, (int)yychar, yytext()); }
\"                      { return new Symbol(sym.COMILLA_DOBLE, yyline, (int)yychar, yytext()); }

\n                      { yychar = 1; }

{ESPACIOS}              {}
{COMENTARIO_MULTILINEA} { System.out.println(yytext()); }
{COMENTARIO_LINEAL}      { System.out.println(yytext()); }

{DECIMAL}               { return new Symbol(sym.DECIMAL, yyline, (int)yychar, yytext()); }
{ENTERO}                { return new Symbol(sym.ENTERO, yyline, (int)yychar, yytext()); }
{CADENA}                { return new Symbol(sym.CADENA, yyline, (int)yychar, yytext()); }
{CARACTER}              { return new Symbol(sym.CARACTER, yyline, (int)yychar, yytext()); }
{BOOLEANO}              { return new Symbol(sym.BOOLEANO, yyline, (int)yychar, yytext()); }
{IDENTIFICADOR}         { return new Symbol(sym.IDENTIFICADOR, yyline, (int)yychar, yytext()); }

. {
    lexicalErrors.add(new LexicalError(yytext(), yyline, (int)yychar));
    System.out.println("Error lexico en: " + yytext() + ", Linea: " + yyline + ", Columna: " + yychar);
  }