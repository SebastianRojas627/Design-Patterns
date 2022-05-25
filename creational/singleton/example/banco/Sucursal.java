package creational.singleton.example.banco;

public class Sucursal {
    private String name;
    private Person person;

    public Sucursal(Person person, String name) {
        this.person = person;
        this.name = name;
    }

    public void retiriarDineroSucursal(int cantidad) {
        ManagerSaldo.getInstance().retiroDinero(cantidad);
    }
}