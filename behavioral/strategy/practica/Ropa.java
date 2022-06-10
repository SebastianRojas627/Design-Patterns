package behavioral.strategy.practica;

public class Ropa {

    private String tipo;
    private double precioI;
    private double precioF;

    public Ropa(String tipo, double precio) {

        this.tipo = tipo;
        this.precioI = precio;
        precioF = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioI() {
        return precioI;
    }

    public void setPrecioI(double precioI) {

        this.precioI = precioI;
    }

    public double getPrecioF() {
        return precioF;
    }

    public void setPrecioF(double precioF) {
        this.precioF = precioF;
    }

    public void showInfo() {

        System.out.println("\n ***PRENDA DE ROPA***");
        System.out.println("tipo: " + getTipo());
        System.out.println("precio: " + getPrecioF());
    }
}
