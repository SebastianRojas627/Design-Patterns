package structural.composite.practica;

public class Client {

    public static void main(String[] args) {

        Computadora c1 = new Computadora();
        Computadora c2 = new Computadora();
        Computadora c3 = new Computadora();
        Computadora c4 = new Computadora();
        Computadora c5 = new Computadora();
        Computadora c6 = new Computadora();

        Composite lab1 = new Composite("laboratorio computadoras 1");
        lab1.add(c1);
        lab1.add(c2);
        lab1.getTotal();

        Composite lab2 = new Composite("laboratorio computadoras 2");
        lab2.add(c3);
        lab2.add(c4);
        lab2.add(c5);
        lab2.add(c6);
        lab2.getTotal();

        Composite contenedor = new Composite("contenedor de computadoras");
        contenedor.add(lab1);
        contenedor.add(lab2);
        contenedor.getTotal();

    }
}
