package abstractFactory.examples.ide;

public class Eclipse implements Ide {
    @Override
    public void showInfo() {
        System.out.println("Este es una instancia de Eclipse");
    }
}