package behavioral.observer.practica;

public class Noticia implements INotificacion{

    private String noticia;

    public Noticia(String noticia) {

        this.noticia = noticia;
    }

    @Override
    public void showInfo() {
        System.out.println("\n***NOTICIA***");
            System.out.println("La noticia de ulitmo momento es: " + noticia);
    }
}
