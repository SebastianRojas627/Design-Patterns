package structural.bridge.practica;

public class Paquete {

    public double precio;
    public String nombrePaquete;

    public Paquete(double precio, String nombrePaquete) {

        this.precio = precio;
        this.nombrePaquete = nombrePaquete;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }
}
