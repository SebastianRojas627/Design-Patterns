package structural.proxy.practica;

public class Sol implements IMoneda{

    private double cambio = 0.54;
    private static Sol instance = new Sol();

    private Sol(){}

    @Override
    public double realizarCambio(double cantidad) {
        return cantidad / cambio;
    }

    public static Sol getInstance() { return instance;}
}
