package behavioral.observer.practica;

public class Promociones implements INotificacion{

    private String promocion;

    public Promociones(String promocion) {

        this.promocion = promocion;
    }

    @Override
    public void showInfo() {
        System.out.println("\n***PROMOCION***");
        System.out.println("La nueva promocion es: " + promocion);
    }
}
