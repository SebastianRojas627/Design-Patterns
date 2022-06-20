package structural.proxy.practica;

public class Boliviano implements IMoneda{

    private static Boliviano instance = new Boliviano();

    @Override
    public double realizarCambio(double cantidad) {
        return cantidad;
    }

    public static Boliviano getInstance() {
        return instance;
    }
}
