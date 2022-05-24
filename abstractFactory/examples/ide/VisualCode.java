package abstractFactory.examples.ide;

public class VisualCode implements Ide {
    @Override
    public void showInfo() {
        System.out.println("Este es una instancia de VisualCode");
    }
}