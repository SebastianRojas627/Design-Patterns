package behavioral.observer.practica;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements IEmpresa{

    PrecioLLamada precioLLamada;
    Promociones promociones;
    Premios premios;
    Noticia noticia;

    private List<IUser> users = new ArrayList<>();

    @Override
    public void subscription(IUser observer) {
        users.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers(INotificacion notificacion) {
        for (IUser user : users) {

            if(notificacion instanceof  PrecioLLamada && user.getPrecioLlamadas()) {
                user.update("Nuevo precio de llamadas!", notificacion);
            }
            if(notificacion instanceof  Promociones && user.getPromociones()) {
                user.update("Nueva promocion!", notificacion);
            }
            if(notificacion instanceof  Premios && user.getPremio()) {
                user.update("Nuevo premio!", notificacion);
            }
            if(notificacion instanceof  Noticia && user.getNoticia()) {
                user.update("Nuevas noticias!", notificacion);
            }
        }
    }

    public void setPrecioLLamada(PrecioLLamada precioLLamada) {
        this.precioLLamada = precioLLamada;
        notifyObservers(precioLLamada);
    }

    public void setPromociones(Promociones promociones) {
        this.promociones = promociones;
        notifyObservers(promociones);
    }

    public void setPremios(Premios premios) {
        this.premios = premios;
        notifyObservers(premios);
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
        notifyObservers(noticia);
    }
}
