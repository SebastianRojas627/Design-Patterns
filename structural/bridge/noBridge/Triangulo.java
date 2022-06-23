package structural.bridge.noBridge;

public class Triangulo implements IFigure {

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void pintarRojo() {
        System.out.println("pintando Triangulo de color rojo");
    }

    @Override
    public void pintarAzul() {
        System.out.println("pintando Triangulo de color azul");
    }

    @Override
    public void pintarVerde() {
        System.out.println("pintando Triangulo de color verde");
    }

    @Override
    public void pintarAmarillo() {
        System.out.println("no esta implementado");
    }
}