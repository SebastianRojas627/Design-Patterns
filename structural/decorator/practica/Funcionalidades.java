package structural.decorator.practica;

public abstract class Funcionalidades implements Component {

    protected Component component;

    public Funcionalidades(Component component) {
        this.component = component;
    }

    @Override
    public void showInfo() {
        component.showInfo();
    }

    @Override
    public void operation() {
        component.operation();
    }

    @Override
    public void setMonto(double monto) {
        component.setMonto(monto);
    }

    @Override
    public double getMonto() {
        return component.getMonto();
    }
}
