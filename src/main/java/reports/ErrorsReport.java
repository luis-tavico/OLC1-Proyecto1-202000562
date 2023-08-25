package reports;

import errors.LexicalError;
import java.util.LinkedList;

public class ErrorsReport {

    String code = "";

    public String generateErrorsReport(LinkedList<LexicalError> lexErrors) {

        code += "<!DOCTYPE html>\n";
        code += "    <html lang=\"es\">\n";
        code += "      <head>\n";
        code += "        <meta charset=\"UTF-8\" />\n";
        code += "        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n";
        code += "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n";
        code += "        <title>Errors</title>\n";
        code += "        <link rel=\"stylesheet\" href=\"styleTables.css\" />\n";
        code += "      </head>\n";
        code += "      <body>\n";
        code += "        <div class=\"container\">\n";
        code += "          <h2>TABLA DE ERRORES</h2>\n";
        code += "          <table>\n";
        code += "            <thead>\n";
        code += "              <tr>\n";
        code += "                <th>Lexema</th>\n";
        code += "                <th>Descripcion</th>\n";
        code += "                <th>Linea</th>\n";
        code += "                <th>Columna</th>\n";
        code += "              </tr>\n";
        code += "            </thead>\n";
        code += "            <tbody>\n";
        for (LexicalError lexError : lexErrors) {
            
            code += "              <tr>\n";
            code += "                <td>" + lexError.lexeme + "</td>\n";
            code += "                <td>error lexico</td>\n";
            code += "                <td>" + lexError.line + "</td>\n";
            code += "                <td>" + lexError.column + "</td>\n";
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
