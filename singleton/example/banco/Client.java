package singleton.example.banco;

public class Client {

    public static void main(String[] args) {
//900 -600 =300
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                BancaMovil bancaMovil = new BancaMovil(new Person("Jose"), "BCP");
                bancaMovil.retiriarDinero(100);
            }
        });


        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero cajero = new Cajero(new Person("Maria"), "7");
                cajero.retiriarDineroTargeta(200);
            }
        });

        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Sucursal sucursal = new Sucursal(new Person("Juan"), "central");
                sucursal.retiriarDineroSucursal(300);
            }
        });

        hilo1.start();
        hilo2.start();
        hilo3.start();


    }
}