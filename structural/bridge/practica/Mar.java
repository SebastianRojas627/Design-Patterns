package structural.bridge.practica;

public class Mar implements IMetodoEnvio{

    @Override
    public void realizarEnvio(Paquete paquete) {
        double precio = paquete.getPrecio() * 0.5 + paquete.getPrecio();
        System.out.println("El envio sera por mar y el costo total del envio es de " + precio);
    }
}
