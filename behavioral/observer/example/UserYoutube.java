package behavioral.observer.example;

public class UserYoutube implements IUser {

    String categoria;
    Persona persona;

    public UserYoutube(String categoria, Persona persona) {
        this.categoria = categoria;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Video newVideo) {
        System.out.println("******* Notificacion: " + msg + " *****");
        System.out.println("persona: " + persona.getName());
        System.out.println("categoria preferencia: " + categoria);
        newVideo.showInfo();
    }

    @Override
    public String getPreferenciaCategoria() {
        return categoria;
    }

    public Persona getPersona() {
        return persona;
    }
}