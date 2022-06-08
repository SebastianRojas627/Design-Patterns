package behavioral.observer.practica;

public class PrecioLLamada implements INotificacion{

    private int precioLlamada;

    public PrecioLLamada(int precioLlamada) {

        this.precioLlamada = precioLlamada;
    }

    @Override
    public void showInfo() {
        System.out.println("\n***PRECIO DE LLAMADA***");
        System.out.println("Nuevo precio de llamada es: " + precioLlamada);
    }
}
