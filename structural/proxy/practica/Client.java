package structural.proxy.practica;

public class Client {

    public static void main(String[] args) {

        TarjetaDebito tarjetaDebito = new TarjetaDebito();

        tarjetaDebito.depositar(Boliviano.getInstance(), 100);
        tarjetaDebito.realizarCompra(Boliviano.getInstance(), 75);

        tarjetaDebito.depositar(Dolar.getInstance(), 80);
        tarjetaDebito.realizarCompra(Dolar.getInstance(), 30);

        tarjetaDebito.depositar(Euro.getInstance(), 20);
        tarjetaDebito.realizarCompra(Euro.getInstance(), 40);

        tarjetaDebito.depositar(Sol.getInstance(), 10);
        tarjetaDebito.realizarCompra(Sol.getInstance(), 46);

        tarjetaDebito.depositar(Real.getInstance(), 45);
        tarjetaDebito.realizarCompra(Real.getInstance(), 100);

        tarjetaDebito.realizarCompra(Dolar.getInstance(), 10000);
    }
}
