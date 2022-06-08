package behavioral.observer.practica;

public interface IUser {

    void update(String msg, INotificacion notificacion);

    boolean getPrecioLlamadas();

    boolean getNoticia();

    boolean getPremio();

    boolean getPromociones();
}
