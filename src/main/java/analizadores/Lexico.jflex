package analizadores;
import java_cup.runtime.*;

%%

%{
    
%}

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

%init{
    yyline = 1;
    yychar = 1;
    yycolumn = 1;
%init}

PR_VOID = "void"
PARENTESIS_ABIERTO = "("
PARENTESIS_CERRADO = ")"
LLAVE_ABIERTA = "{"
LLAVE_CERRADA = "}"
CORCHETE_ABIERTO = "["
CORCHETE_CERRADO = "]"
MAYOR_QUE = ">"
MENOR_QUE = "<"
DOLAR = "$"
IGUAL = "="
PUNTO = "."
COMA = ","
PUNTO_Y_COMA = ";"
DOS_PUNTOS = ":"
COMILLA_DOBLE = \"

ESPACIOS = [ \t\r\n]+
CARACTER_ENTRADA = .|[^.]
COMENTARIO_MULTILINEA = "/*" {CARACTER_ENTRADA} + "*/"
COMENTARIO_LINEAL = "//" .*
LETRA_MINUSCULA = [a-z]
LETRA_MAYUSCULA = [A-Z]
NUMERO = [0-9]
CARACTERES_ESPECIALES = [ -/:-@\[-`{-}]
IDENTIFICADOR = [a-zA-Z_][a-zA-Z0-9_]+

%%

<YYINITIAL> {COMENTARIO_MULTILINEA} { System.out.println(yytext()); }
<YYINITIAL> {COMENTARIO_LINEAL} { System.out.println(yytext()); }
<YYINITIAL> {ESPACIOS} { }
<YYINITIAL> {COMILLA_DOBLE} { System.out.println(yytext()); return new Symbol(sym.COMILLA_DOBLE, yyline, yycolumn, yytext()); }
<YYINITIAL> {PR_VOID} { System.out.println(yytext() + " " + yyline + " " + yycolumn); return new Symbol(sym.PR_VOID, yyline, yycolumn, yytext()); }
<YYINITIAL> {PARENTESIS_ABIERTO} { System.out.println(yytext() + " " + yyline + " " + yycolumn); return new Symbol(sym.PARENTESIS_ABIERTO, yyline, yycolumn, yytext()); }
<YYINITIAL> {PARENTESIS_CERRADO} { System.out.println(yytext() + " " + yyline + " " + yycolumn); return new Symbol(sym.PARENTESIS_CERRADO, yyline, yycolumn, yytext()); }
<YYINITIAL> {LLAVE_ABIERTA} { System.out.println(yytext()); return new Symbol(sym.LLAVE_ABIERTA, yyline, yycolumn, yytext()); }
<YYINITIAL> {LLAVE_CERRADA} { System.out.println(yytext()); return new Symbol(sym.LLAVE_CERRADA, yyline, yycolumn, yytext()); }
<YYINITIAL> {CORCHETE_ABIERTO} { System.out.println(yytext()); return new Symbol(sym.CORCHETE_ABIERTO, yyline, yycolumn, yytext()); }
<YYINITIAL> {CORCHETE_CERRADO} { System.out.println(yytext()); return new Symbol(sym.CORCHETE_CERRADO, yyline, yycolumn, yytext()); }
<YYINITIAL> {MAYOR_QUE} { System.out.println(yytext()); return new Symbol(sym.MAYOR_QUE, yyline, yycolumn, yytext()); }
<YYINITIAL> {MENOR_QUE} { System.out.println(yytext()); return new Symbol(sym.MENOR_QUE, yyline, yycolumn, yytext()); }
<YYINITIAL> {DOLAR} { System.out.println(yytext()); return new Symbol(sym.DOLAR, yyline, yycolumn, yytext()); }
<YYINITIAL> {IGUAL} { System.out.println(yytext()); return new Symbol(sym.IGUAL, yyline, yycolumn, yytext()); }
<YYINITIAL> {PUNTO} { System.out.println(yytext()); return new Symbol(sym.PUNTO, yyline, yycolumn, yytext()); }
<YYINITIAL> {COMA} { System.out.println(yytext()); return new Symbol(sym.COMA, yyline, yycolumn, yytext()); }
<YYINITIAL> {PUNTO_Y_COMA} { System.out.println(yytext()); return new Symbol(sym.PUNTO_Y_COMA, yyline, yycolumn, yytext()); }
<YYINITIAL> {DOS_PUNTOS} { System.out.println(yytext()); return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn, yytext()); }
<YYINITIAL> {COMILLA_DOBLE} { System.out.println(yytext()); return new Symbol(sym.COMILLA_DOBLE, yyline, yycolumn, yytext()); }
<YYINITIAL> {IDENTIFICADOR} { System.out.println(yytext()); return new Symbol(sym.IDENTIFICADOR, yyline, yycolumn, yytext()); }
<YYINITIAL> {LETRA_MINUSCULA} { System.out.println(yytext()); return new Symbol(sym.LETRA_MINUSCULA, yyline, yycolumn, yytext()); }
<YYINITIAL> {LETRA_MAYUSCULA} { System.out.println(yytext()); return new Symbol(sym.LETRA_MAYUSCULA, yyline, yycolumn, yytext()); }
<YYINITIAL> {NUMERO} { System.out.println(yytext()); return new Symbol(sym.NUMERO, yyline, yycolumn, yytext()); }
<YYINITIAL> {CARACTERES_ESPECIALES} { System.out.println(yytext()); return new Symbol(sym.CARACTERES_ESPECIALES, yyline, yycolumn, yytext()); }