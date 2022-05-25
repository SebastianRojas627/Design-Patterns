package creational.singleton.example.logger;

public class ClientExample {

    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Computadora");
        product.setAmount(5);
        product.getAmount();
        product.setPrice(500);
        product.promotionPrice();

        Product product1 = new Product();
        product1.setName("Computadora1");

        Invoice invoice = new Invoice();
        invoice.setNroInvoice(456);
        invoice.getNroInvoice();

        invoice.setDetail(product.getName());
        Client client = new Client();
        client.setPoints("8888");
        client.getPoints();

        Supplier supplier = new Supplier();
        supplier.setName("IBM");
        supplier.getName();
    }
}