package builder.practica;

public class Owner {
    private BuilderPizza builder;

    public Pizza getPizzaHecha() {
        return builder.getProduct();
    }

    public void setBuilder(BuilderPizza builder) {
        this.builder = builder;
    }

    public void armarComputadora() {
        this.builder.createPizza();
        this.builder.definePizza();
        this.builder.buildIngredientes();
        this.builder.buildTipoQueso();
        this.builder.buildTipoMasa();
    }
}
