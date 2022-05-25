package creational.singleton.practice;

public class ExchangeIssuer {

    private static ExchangeIssuer instance;
    private static double dollarValue;
    private static double euroValue;
    private static double euroToDollar;

    private ExchangeIssuer() {
        dollarValue = 6.88;
        euroValue = 7.27;
        euroToDollar = 1.06;
        System.out.println("Opening Exchange Issuer technology");
    }

    public static ExchangeIssuer getInstance() {
        if (instance == null)
            instance = new ExchangeIssuer();
        return instance;
    }

    public double getDollarValue() {
        return dollarValue;
    }

    public void setDollarValue(double dollarValue) {
        ExchangeIssuer.dollarValue = dollarValue;
        System.out.println("Valor de dolar actualizado");
    }

    public double getEuroValue() {
        return euroValue;
    }

    public void setEuroValue(double euroValue) {
        ExchangeIssuer.euroValue = euroValue;
        System.out.println("Valor de euro actualizado");
    }

    public double getEuroToDollar() { return euroToDollar; }

    public void setEuroToDollar(double euroToDollar) {
        ExchangeIssuer.euroToDollar = euroToDollar;
        System.out.println("Valor de euro-dolar actualizado");
    }
}
