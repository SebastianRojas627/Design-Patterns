package structural.proxy.practica;

public class Dolar implements IMoneda{

    private double cambio = 0.15;
    private static Dolar instance = new Dolar();

    private Dolar(){}


    @Override
    public double realizarCambio(double cantidad) {
        return cantidad / cambio;
    }

    public static Dolar getInstance() { return instance;}
}
