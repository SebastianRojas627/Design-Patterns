package factoryMethod.example.heladeria;

public class Client {

    public static void main(String[] args) {
        HeladoAgua h1 = new CreatorHeladoAgua().createProduct();
        h1.showInfo();

        HeladoCrema h2 = new CreatorHeladoCrema().createProduct();
        h2.showInfo();

        HeladoMixto h3 = new CreatorHeladoMixto().createProduct();
        h3.showInfo();

    }


}