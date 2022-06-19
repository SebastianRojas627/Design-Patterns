package behavioral.visitor.practica;

import java.text.DecimalFormat;

public class Librecambista implements IVisitante{

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public double toDollar(double cantidad, double cambio) {

        return cantidad / cambio;
    }

    public double toLocalCurrency(double cantidad, double cambio) {
        return cantidad * cambio;
    }

    @Override
    public void realizarCambio(Bolivia bolivia, boolean aDolar, double cantidad) {

        double cambio = 6.90;
        if(aDolar) {
            System.out.println("Cambiando " + cantidad + " bolivianos a " + df.format(toDollar(cantidad, cambio)) + " dolares");
        } else {
            System.out.println("Cambiando " + cantidad + " dolares a " + df.format(toLocalCurrency(cantidad, cambio)) + " bolivianos");
        }
    }

    @Override
    public void realizarCambio(Argentina argentina, boolean aDolar, double cantidad) {

        double cambio = 123.16;
        if(aDolar) {
            System.out.println("Cambiando " + cantidad + " pesos argentinos a " + df.format(toDollar(cantidad, cambio)) + " dolares");
        } else {
            System.out.println("Cambiando " + cantidad + " dolares a " + df.format(toLocalCurrency(cantidad, cambio)) + " pesos argentinos");
        }
    }

    @Override
    public void realizarCambio(Brasil brasil, boolean aDolar, double cantidad) {

        double cambio = 5.15;
        if(aDolar) {
            System.out.println("Cambiando " + cantidad + " reales a " + df.format(toDollar(cantidad, cambio)) + " dolares");
        } else {
            System.out.println("Cambiando " + cantidad + " dolares a " + df.format(toLocalCurrency(cantidad, cambio)) + " reales");
        }
    }

    @Override
    public void realizarCambio(Italia italia, boolean aDolar, double cantidad) {

        double cambio = 0.95;
        if(aDolar) {
            System.out.println("Cambiando " + cantidad + " euros a " + df.format(toDollar(cantidad, cambio)) + " dolares");
        } else {
            System.out.println("Cambiando " + cantidad + " dolares a " + df.format(toLocalCurrency(cantidad, cambio)) + " euros");
        }
    }
}
