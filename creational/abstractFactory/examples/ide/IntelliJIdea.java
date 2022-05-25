package creational.abstractFactory.examples.ide;

public class IntelliJIdea implements Ide {
    @Override
    public void showInfo() {
        System.out.println("Este es una instancia de IntelliJ");
    }
}