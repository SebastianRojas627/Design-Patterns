package creational.singleton.practice;

public class Client {

    public static void main(String[] args) {

        Banco banco = new Banco("Calle 35 Achumani", "BNB");
        CasaCambio casaDeCambio = new CasaCambio("Libre Cambio", "Calle 14 de Calacoto");
        LibreCambista libreCambista = new LibreCambista("Calle 21 de Calacoto", "Juan Perez");

        banco.dollarToBs(10);
        casaDeCambio.bsToEuro(90);
        libreCambista.euroToBs(20);

        ExchangeIssuer.getInstance().setDollarValue(8.5);
        ExchangeIssuer.getInstance().setEuroValue(9.8);
        ExchangeIssuer.getInstance().setEuroToDollar(1.96);

        casaDeCambio.bsToDollar(140);
        libreCambista.euroToDollar(500);
        banco.dollarToEuro(96);
    }
}
