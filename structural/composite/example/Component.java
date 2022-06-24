package structural.composite.example;

public abstract class Component {

    private String type;
    private String titulo;
    private int priority;
    private int estimation;
    private String description;
    private String space = "";

    public Component(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Component setType(String type) {
        this.type = type;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Component setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public int getPriority() {
        return priority;
    }

    public Component setPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public int getEstimation() {
        return estimation;
    }

    public Component setEstimation(int estimation) {
        this.estimation = estimation;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Component setDescription(String description) {
        this.description = description;
        return this;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public void showInformation() {
        System.out.println(space + "*** type: " + type.toUpperCase());
        System.out.println(space + "- titulo: " + titulo);
        System.out.println(space + "- priority: " + priority);
        System.out.println(space + "- estimation: " + estimation);
        System.out.println(space + "- description: " + description);
    }

    public abstract void detailAgileBoard();

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int position);
}
