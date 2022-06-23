package structural.bridge.noBridge;

public class Client {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.pintarAzul();
        circulo.pintarRojo();
        circulo.pintarVerde();

        Triangulo triangulo = new Triangulo();
        triangulo.pintarAzul();

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.pintarRojo();

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.pintarAmarillo();

    }
}