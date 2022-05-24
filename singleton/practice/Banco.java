package singleton.practice;

public class Banco extends CurrencyExchangePlace {

    private final String chain;

    @Override
    public void greet() {
        System.out.println("Realizando cambio de moneda en el banco de " + chain + " ubicado en " + getAddress());
    }

    public Banco(String address, String chain) {
        super(address);
        this.chain = chain;
    }

}
