package structural.decorator.practica;

public class BankAccount implements Component{

    private double monto;
    private String propietario;

    public BankAccount(double monto, String propietario) {

        this.monto = monto;
        this. propietario = propietario;
    }

    @Override
    public double getMonto() {
        return monto;
    }

    @Override
    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public void showInfo() {
        System.out.println("\nCuenta de banco");
        System.out.println("Propietario: " + propietario);
        System.out.println("Monto: " + monto);
    }

    @Override
    public void operation() {
        System.out.println("Cuenta bancaria realizando operacion");
    }
}
