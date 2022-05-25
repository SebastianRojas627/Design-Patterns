package creational.builder.practica;

public class Hawaiiana extends BuilderPizza{

    @Override
    public void definePizza() {
        System.out.println("\n PIZZA HAWAIIANA");
    }

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("piña, salsa de tomate, otro");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("masa normal");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("mozarella tipo 2");
    }
}
