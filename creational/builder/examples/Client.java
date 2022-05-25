package creational.builder.examples;

public class Client {

    public static void main(String[] args) {
        Owner jose = new Owner();
        BuilderComputadora pci9 = new I9Alto();
        BuilderComputadora pci7 = new I7Medio();
        BuilderComputadora pci5 = new I5Baja();

        jose.setBuilder(pci9);
        jose.armarComputadora();

        Computadora computadora1 = jose.getComputadoraArmada();
        computadora1.showInfo();

        jose.setBuilder(pci7);
        jose.armarComputadora();
        Computadora computadora2 = jose.getComputadoraArmada();
        computadora2.showInfo();

        jose.setBuilder(pci5);
        jose.armarComputadora();
        Computadora computadora3 = jose.getComputadoraArmada();
        computadora3.showInfo();

    }

}