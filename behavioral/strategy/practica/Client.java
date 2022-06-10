package behavioral.strategy.practica;

public class Client {

    public static void main(String[] args) {

        Tienda tienda = new Tienda("Tienda");

        Primavera primavera = new Primavera();
        Verano verano = new Verano();
        Invierno invierno = new Invierno();
        Otono otono = new Otono();

        tienda.addPrenda(new Ropa("pantalon", 60));
        tienda.addPrenda(new Ropa("polera", 95));
        tienda.addPrenda(new Ropa("chamarra", 105));

        tienda.setEstacion(primavera);
        tienda.cambiarEstacion();

        tienda.setEstacion(verano);
        tienda.cambiarEstacion();

        tienda.setEstacion(invierno);
        tienda.cambiarEstacion();

        tienda.setEstacion(otono);
        tienda.cambiarEstacion();

    }
}
