package creational.factoryMethod.example.heladeria;

public abstract class Creator {
    public Creator() {
    }

    public abstract IHelado createProduct();
}