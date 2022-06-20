package structural.proxy.practica;

public class Euro implements IMoneda{

    private double cambio = 0.14;
    private static Euro instance = new Euro();

    private Euro(){}

    @Override
    public double realizarCambio(double cantidad) {
        return cantidad / cambio;
    }

    public static Euro getInstance() { return instance;}
}
