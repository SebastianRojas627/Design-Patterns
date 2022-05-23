package singleton.example.banco;

public class Cajero {
    private String numeroCajero;
    private Person person;

    public Cajero(Person person, String numeroCajero) {
        this.person = person;
        this.numeroCajero = numeroCajero;
    }

    public void retiriarDineroTargeta(int cantidad) {
        ManagerSaldo.getInstance().retiroDinero(cantidad);
    }
}