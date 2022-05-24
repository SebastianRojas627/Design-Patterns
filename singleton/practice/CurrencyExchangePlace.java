package singleton.practice;

import java.text.DecimalFormat;

abstract class CurrencyExchangePlace {
    private final String address;

    public CurrencyExchangePlace(String address) {
        this.address = address;
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public String getAddress() {
        return address;
    }

    public double getDollarValue() {
        return ExchangeIssuer.getInstance().getDollarValue();
    }

    public abstract void greet();

    public double getEuroValue() {
        return ExchangeIssuer.getInstance().getEuroValue();
    }

    public double getEuroToDollar() {
        return ExchangeIssuer.getInstance().getEuroToDollar();
    }

    public void bsToDollar(double bsAmount) {
        double dollar = getDollarValue();
        greet();
        System.out.println("Cambiando bs" + df.format(bsAmount) + " a $" + df.format(bsAmount / dollar));
    }

    public void dollarToBs(double dollarAmount) {
        double dollar = getDollarValue();
        greet();
        System.out.println("Cambiando $" + df.format(dollarAmount) + " a bs" + df.format(dollarAmount * dollar));
    }

    public void bsToEuro(double bsAmount) {
        double euro = getEuroValue();
        greet();
        System.out.println("Cambiando bs" + df.format(bsAmount) + " a €" + df.format(bsAmount / euro));
    }

    public void euroToBs(double euroAmount) {
        double euro = getEuroValue();
        greet();
        System.out.println("Cambiando €" + df.format(euroAmount) + " a bs" + df.format(euroAmount * euro));
    }

    public void euroToDollar(double euroAmount) {
        double euro = getEuroToDollar();
        greet();
        System.out.println("Cambiando €" + df.format(euroAmount) + " a $" + df.format(euro * euroAmount));
    }

    public void dollarToEuro(double dollarAmount) {
        double euro = getEuroToDollar();
        greet();
        System.out.println("Cambiando $" + df.format(dollarAmount) + " a €" + df.format(dollarAmount / euro));
    }
}
