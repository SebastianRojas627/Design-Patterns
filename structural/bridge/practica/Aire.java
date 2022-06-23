package structural.bridge.practica;

public class Aire implements IMetodoEnvio{

    @Override
    public void realizarEnvio(Paquete paquete) {
        double precio = paquete.getPrecio() * 0.1 + paquete.getPrecio();
        System.out.println("El envio sera por aire y el costo total del envio es de " + precio);
    }
}
