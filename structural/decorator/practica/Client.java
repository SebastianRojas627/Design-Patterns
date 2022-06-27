package structural.decorator.practica;

public class Client {

    public static void main(String[] args) {

        Component cuenta = new BankAccount(500, "Manueel");

        cuenta = new Promocion(cuenta);
        cuenta = new BancaInternet(cuenta, true);
        cuenta = new Seguro(cuenta, 50);

        cuenta.showInfo();
        cuenta.operation();
    }
}
