package structural.adapter.practica;

public class Computadora implements Artefactos1 {

    public int precio;
    public String tiempoVida;

    public Computadora(int precio, String tiempoVida) {

        this.precio = precio;
        this.tiempoVida = tiempoVida;
    }

    @Override
    public void getPrecio() {
        System.out.println("Precio computadora es: " + precio);
    }

    @Override
    public void getTiempoVida() {
        System.out.println("Tiempo de vida computadora es: " + tiempoVida);
    }

}
