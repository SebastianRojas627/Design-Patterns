package structural.decorator.practica;

public class Seguro extends Funcionalidades {

    private double montoDescuento;

    public Seguro(Component component, double montoDescuento) {
        super(component);
        this.montoDescuento = montoDescuento;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("El monto de " + montoDescuento + " es descontado de la cuenta por el seguro");
    }

    @Override
    public void operation() {
        super.operation();
        super.component.setMonto(super.getMonto() - montoDescuento);
        System.out.println("Se desconto " + montoDescuento + " para renovar el seguro");
    }
}
