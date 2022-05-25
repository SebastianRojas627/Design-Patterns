package creational.builder.examples;

public class I5Baja extends BuilderComputadora {

    @Override
    public void buildMonitor() {
        this.computadora.setMonitor("I5Baja 24");
    }

    @Override
    public void buildTeclado() {
        this.computadora.setTeclado("I5Baja normal");
    }

    @Override
    public void buildMouse() {
        this.computadora.setMouse("I5Baja normal");
    }

    @Override
    public void buildMemoria() {
        this.computadora.setMemoria("I5Baja 8gb");
    }

    @Override
    public void buildProcesador() {
        this.computadora.setProcesador("I5Baja i5");
    }

    @Override
    public void buildVideo() {
        this.computadora.setVideo("I5Baja 4");
    }
}