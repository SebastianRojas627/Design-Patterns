package creational.builder.examples;

public class Owner {
    private BuilderComputadora builder;

    public Computadora getComputadoraArmada() {
        return builder.getProduct();
    }

    public void setBuilder(BuilderComputadora builder) {
        this.builder = builder;
    }

    public void armarComputadora() {
        this.builder.createComputadora();
        this.builder.buildMonitor();
        this.builder.buildMemoria();
        this.builder.buildMouse();
        this.builder.buildProcesador();
        this.builder.buildVideo();
        this.builder.buildTeclado();
    }
}