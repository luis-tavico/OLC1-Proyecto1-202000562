package analyzersJSON;

import java_cup.runtime.*;
import java.util.LinkedList;
import errors.LexicalError;
import tokens.Tokens;

%%

%class LexicalJSON
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
STRING = \" ([^\"] | "\\\"")+ \"

%%

"{"                     { tokens.add(new Tokens(yytext(), "parentesis_abierto", yyline, (int)yychar)); return new Symbol(sym.LEFT_CURLY_BRACKET, yyline, (int)yychar, yytext()); }
"}"                     { tokens.add(new Tokens(yytext(), "parentesis_cerrado", yyline, (int)yychar)); return new Symbol(sym.RIGHT_CURLY_BRACKET, yyline, (int)yychar, yytext()); }
"["                     { tokens.add(new Tokens(yytext(), "corchete_abierto", yyline, (int)yychar)); return new Symbol(sym.LEFT_SQUARE_BRACKET, yyline, (int)yychar, yytext()); }
"]"                     { tokens.add(new Tokens(yytext(), "corchete_cerrado", yyline, (int)yychar)); return new Symbol(sym.RIGHT_SQUARE_BRACKET, yyline, (int)yychar, yytext()); }
","                     { tokens.add(new Tokens(yytext(), "coma", yyline, (int)yychar)); return new Symbol(sym.COMMA, yyline, (int)yychar, yytext()); }
":"                     { tokens.add(new Tokens(yytext(), "dos_puntos", yyline, (int)yychar)); return new Symbol(sym.COLON, yyline, (int)yychar, yytext()); }

\n                      { yychar = 0; }

{BLANKS}                { }
{MULTILINE_COMMENT}     { }
{SIMPLE_COMMENT}        { }

{DECIMAL}               { tokens.add(new Tokens(yytext(), "decimal", yyline, (int)yychar)); return new Symbol(sym.DECIMAL, yyline, (int)yychar, yytext()); }
{STRING}                { tokens.add(new Tokens(yytext(), "cadena", yyline, (int)yychar)); return new Symbol(sym.STRING, yyline, (int)yychar, yytext()); }

. {
    lexicalErrors.add(new LexicalError(yytext(), yyline, (int)yychar));
  }
