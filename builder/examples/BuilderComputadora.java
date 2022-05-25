package builder.examples;

public abstract class BuilderComputadora {
    protected Computadora computadora;

    public Computadora getProduct() {
        return computadora;
    }

    public void createComputadora() {
        this.computadora = new Computadora();
    }

    public abstract void buildMonitor();

    public abstract void buildTeclado();

    public abstract void buildMouse();

    public abstract void buildMemoria();

    public abstract void buildProcesador();

    public abstract void buildVideo();
}