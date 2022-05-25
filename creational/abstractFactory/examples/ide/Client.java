package creational.abstractFactory.examples.ide;

public class Client {
    public static void main(String[] args) {
        Ide ide = FactoryIDE.make("visualstudio");
        ide.showInfo();
        compilar(ide);
        runTest(ide);
        build(ide);
        createImage(ide);
        createArtefacto(ide);
    }

    private static void compilar(Ide ideEditor) {
    }

    private static void runTest(Ide ideEditor) {
    }

    private static void build(Ide ideEditor) {
    }

    private static void createImage(Ide ideEditor) {
    }

    private static void createArtefacto(Ide ideEditor) {
    }


}