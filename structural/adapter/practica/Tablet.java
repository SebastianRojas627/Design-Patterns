package structural.adapter.practica;

public class Tablet implements Artefactos1 {

    public int precio;
    public String tiempoVida;

    public Tablet(int precio, String tiempoVida) {

        this.precio = precio;
        this.tiempoVida = tiempoVida;
    }

    @Override
    public void getPrecio() {
        System.out.println("Precio tablet es: " + precio);
    }

    @Override
    public void getTiempoVida() {
        System.out.println("Tiempo de vida tablet es: " + tiempoVida);
    }

}