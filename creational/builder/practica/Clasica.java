package creational.builder.practica;

public class Clasica extends BuilderPizza{

    @Override
    public void definePizza() {
        System.out.println("\n PIZZA CLASICA");
    }

    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("salsa de tomate, otro");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("masa especial");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("doble mozarella tipo 2");
    }
}
