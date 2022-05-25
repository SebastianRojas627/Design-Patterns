package builder.practica;

public class Client {

    public static void main(String[] args) {

        BuilderPizza clasica = new Clasica();
        BuilderPizza carnivora = new Carnivora();
        BuilderPizza hawaiiana = new Hawaiiana();

        Owner chef = new Owner();

        chef.setBuilder(clasica);
        chef.armarComputadora();
        Pizza p1 = chef.getPizzaHecha();
        p1.showInfo();

        chef.setBuilder(carnivora);
        chef.armarComputadora();
        Pizza p2 = chef.getPizzaHecha();
        p2.showInfo();

        chef.setBuilder(hawaiiana);
        chef.armarComputadora();
        Pizza p3 = chef.getPizzaHecha();
        p3.showInfo();

    }
}
