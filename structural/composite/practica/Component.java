package structural.composite.practica;

public abstract class Component {

    private String type;

    public Component(String type) {

        this.type = type;
    }

    public void getTotal() {
        System.out.println("Precio total de " + type + " es: " + getPrecio());
    }

    public abstract int getPrecio();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int position);
}
