package singleton.practica;

public class LibreCambista extends CurrencyExchangePlace {

    private final String name;

    @Override
    public void greet() {
        System.out.println("Realizando cambio de moneda con el libre cambista " + name + " ubicado en " + getAddress());
    }

    public LibreCambista(String address, String name) {
        super(address);
        this.name = name;
    }
}
