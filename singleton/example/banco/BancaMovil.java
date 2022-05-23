package singleton.example.banco;

public class BancaMovil {
    private String name;
    private Person person;

    public BancaMovil(Person person, String name) {
        this.person = person;
        this.name = name;
    }

    public void retiriarDinero(int cantidad) {
        ManagerSaldo.getInstance().retiroDinero(cantidad);
    }
}