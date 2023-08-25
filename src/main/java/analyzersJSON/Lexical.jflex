package analyzersJSON;

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
STRING = \" ([^\"] | "\\\"")+ \"

%%

"{"                     { return new Symbol(sym.LEFT_CURLY_BRACKET, yyline, (int)yychar, yytext()); }
"}"                     { return new Symbol(sym.RIGHT_CURLY_BRACKET, yyline, (int)yychar, yytext()); }
"["                     { return new Symbol(sym.LEFT_SQUARE_BRACKET, yyline, (int)yychar, yytext()); }
"]"                     { return new Symbol(sym.RIGHT_SQUARE_BRACKET, yyline, (int)yychar, yytext()); }
","                     { return new Symbol(sym.COMMA, yyline, (int)yychar, yytext()); }
":"                     { return new Symbol(sym.COLON, yyline, (int)yychar, yytext()); }

\n                      { yychar = 1; }

{BLANKS}                {}
{MULTILINE_COMMENT}     { System.out.println(yytext()); }
{SIMPLE_COMMENT}        { System.out.println(yytext()); }

{DECIMAL}               { return new Symbol(sym.DECIMAL, yyline, (int)yychar, yytext()); }
{STRING}                { return new Symbol(sym.STRING, yyline, (int)yychar, yytext()); }

. {
    lexicalErrors.add(new LexicalError(yytext(), yyline, (int)yychar));
    System.out.println("Error lexico en: " + yytext() + ", Linea: " + yyline + ", Columna: " + yychar);
  }
