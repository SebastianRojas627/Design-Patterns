package structural.proxy.practica;

public class Real implements IMoneda{

    private double cambio = 0.75;
    private static Real instance = new Real();

    private Real(){}

    @Override
    public double realizarCambio(double cantidad) {
        return cantidad / cambio;
    }

    public static Real getInstance() { return instance;}
}
