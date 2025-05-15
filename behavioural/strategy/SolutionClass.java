public class SolutionClass {

    private Compiler compiler;

    public SolutionClass(Compiler compiler) {
        this.compiler = compiler;
    }

    public getScore(byte[] bytes) {
        byte[] compiledCode = compiler.compile(bytes);
        // further steps
    }

}