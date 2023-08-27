package analyzersJSON;

public class Analyzers {

    public static void main(String[] args) {
        generateCompiler();
    }

    private static void generateCompiler() {
        try {
            String path = "src/main/java/analyzersJSON/";
            String opcFlex[] = {path + "LexicalJSON.jflex", "-d", path};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", path, "-parser", "SyntacticJSON", path + "SyntacticJSON.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
