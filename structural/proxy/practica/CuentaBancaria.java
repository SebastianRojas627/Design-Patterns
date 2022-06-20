package structural.proxy.practica;

import java.text.DecimalFormat;

public class CuentaBancaria implements IBanco{

    private double fondos;
    private static final DecimalFormat format = new DecimalFormat("0.00");

    public CuentaBancaria(double fondos) {

        this.fondos = fondos;
    }

    public double getFondos() {
        return fondos;
    }

    @Override
    public void realizarCompra(IMoneda moneda, double cantidad) {

        fondos -= cantidad;
        System.out.println("Compra realizada de valor: " + format.format(cantidad) + "bs, fondos en cuenta: " + format.format(fondos) + "bs");
    }

    @Override
    public void depositar(IMoneda moneda, double cantidad){

       fondos += cantidad;
        System.out.println("Deposito de: " + format.format(cantidad) + "bs exitoso, fondos en cuenta: " + format.format(fondos) + "bs");
    }
}
