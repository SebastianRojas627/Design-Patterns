package behavioral.observer.practica;

public interface IEmpresa {

    void subscription(IUser observer);

    void detach(IUser observer);

    void notifyObservers(INotificacion notificacion);
}
