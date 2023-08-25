package reports;

import java.util.LinkedList;
import tokens.Tokens;

public class TokensReport {

    String code = "";

    public String generateTokenReport(LinkedList<Tokens> tokenErrors) {

        code += "<!DOCTYPE html>\n";
        code += "    <html lang=\"es\">\n";
        code += "      <head>\n";
        code += "        <meta charset=\"UTF-8\" />\n";
        code += "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n";
        code += "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n";
        code += "        <title>Tokens</title>\n";
        code += "        <link rel=\"stylesheet\" href=\"styleTables.css\" />\n";
        code += "      </head>\n";
        code += "      <body>\n";
        code += "        <div class=\"container\">\n";
        code += "          <h2>TABLA DE TOKENS</h2>\n";
        code += "          <table>\n";
        code += "            <thead>\n";
        code += "              <tr>\n";
        code += "                <th>Lexema</th>\n";
        code += "                <th>Token</th>\n";
        code += "                <th>Linea</th>\n";
        code += "                <th>Columna</th>\n";
        code += "              </tr>\n";
        code += "            </thead>\n";
        code += "            <tbody>\n";
        for (Tokens token : tokenErrors) {
            code += "              <tr>\n";
            code += "                <td>" + token.lexeme + "</td>\n";
            code += "                <td>" + token.token + "</td>\n";
            code += "                <td>" + token.line + "</td>\n";
            code += "                <td>" + token.column + "</td>\n";
            code += "              </tr>\n";
        }
        code += "            </tbody>\n";
        code += "          </table>\n";
        code += "        </div>\n";
        code += "      </body>\n";
        code += "    </html>";

        return code;
    }

}
