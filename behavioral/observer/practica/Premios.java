package behavioral.observer.practica;

public class Premios implements INotificacion{

    private String premio;

    public Premios(String premio) {

        this.premio = premio;
    }

    @Override
    public void showInfo() {
        System.out.println("\n***PREMIOS***");
        System.out.println("El nuevo premio es: " + premio);
    }
}
