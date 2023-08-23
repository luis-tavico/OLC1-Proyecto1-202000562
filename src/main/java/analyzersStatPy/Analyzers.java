package analyzersStatPy;

public class Analyzers {

    public static void main(String[] args) {
        generateCompiler();
    }
    
    private static void generateCompiler() {
        try { 
            String path = "src/main/java/analyzersStatPy/";
            String opcFlex[] = {path + "Lexical.jflex", "-d", path};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = {"-destdir", path, "-parser", "Syntactic", path + "Syntactic.cup"};
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
