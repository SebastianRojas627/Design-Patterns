package builder.practica;

public class Carnivora extends BuilderPizza{

    @Override
    public void definePizza() {
        System.out.println("\n PIZZA CARNIVORA");
    }

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("carne, salsa de tomate, otro");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("masa especial");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("mozarella");
    }
}
