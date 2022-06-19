package structural.adapter.practica;

public class Celular implements Artefactos1 {

    public int precio;
    public String tiempoVida;

    public Celular(int precio, String tiempoVida) {

        this.precio = precio;
        this.tiempoVida = tiempoVida;
    }

    @Override
    public void getPrecio() {
        System.out.println("Precio celular es: " + precio);
    }

    @Override
    public void getTiempoVida() {
        System.out.println("Tiempo de vida celular es: " + tiempoVida);
    }

}
