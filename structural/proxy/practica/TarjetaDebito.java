package structural.proxy.practica;

import java.text.DecimalFormat;

public class TarjetaDebito implements IBanco{

    private CuentaBancaria cuentaBancaria;
    private static final DecimalFormat format = new DecimalFormat("0.00");

    public TarjetaDebito() {

        cuentaBancaria = new CuentaBancaria(500);
    }

    @Override
    public void realizarCompra(IMoneda moneda, double cantidad) {

        double cantidadN = moneda.realizarCambio(cantidad);
        if(cantidadN > cuentaBancaria.getFondos()) {
            System.out.println("No hay suficientes fondos para realizar compra de " + format.format(cantidadN) + "bs, compra imposible");
        } else {
            cuentaBancaria.realizarCompra(moneda, cantidadN);
        }
    }

    @Override
    public void depositar(IMoneda moneda, double cantidad) {

        double cantidadN = moneda.realizarCambio(cantidad);
        cuentaBancaria.depositar(moneda, cantidadN);
    }
}
