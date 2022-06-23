package structural.bridge.practica;

public class Tierra implements IMetodoEnvio{

    @Override
    public void realizarEnvio(Paquete paquete) {
        double precio = paquete.getPrecio() * 0.05 + paquete.getPrecio();
        System.out.println("El envio sera por tierra y el costo total del envio es de " + precio);
    }
}