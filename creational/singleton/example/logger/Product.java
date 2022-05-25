package creational.singleton.example.logger;

public class Product {
    private String name;
    private int price;
    private int amount;

    public Product() {
        Logger.getInstance().info("Creation Product");
    }

    public int promotionPrice() {
        Logger.getInstance().info("Product - promotionPrice " + price / 2);
        return price / 2;
    }

    public String getName() {
        Logger.getInstance().info("Product - getName " + name);

        return name;
    }

    public void setName(String name) {
        Logger.getInstance().info("Product - setName " + name);
        this.name = name;
    }

    public int getPrice() {
        Logger.getInstance().info("Product - getPrice " + price);

        return price;
    }

    public void setPrice(int price) {
        Logger.getInstance().info("Product - setPrice " + price);
        this.price = price;
    }

    public int getAmount() {
        Logger.getInstance().info("Product - getAmount " + amount);
        return amount;
    }

    public void setAmount(int amount) {
        Logger.getInstance().info("Product - setAmount " + amount);
        this.amount = amount;
    }
}