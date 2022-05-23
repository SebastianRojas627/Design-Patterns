package singleton.practica;

public class CasaCambio extends CurrencyExchangePlace {

    private final String name;

    @Override
    public void greet() {
        System.out.println("Realizando cambio de moneda en la case de cambio " + name + " ubicada en " + getAddress());
    }

    public CasaCambio(String name, String address) {
        super(address);
        this.name = name;
    }
}
