package behavioral.observer.practica;

public class User extends Persona implements IUser{

    public boolean precioLlamadas;
    public boolean promociones;
    public boolean premios;
    public boolean noticia;


    public User(String ci, String name, boolean precioLlamadas, boolean promociones, boolean premios, boolean noticia) {

        super(ci, name);
        this.precioLlamadas = precioLlamadas;
        this.promociones = promociones;
        this.premios = premios;
        this.noticia = noticia;
    }

    @Override
    public void update(String msg, INotificacion notificacion) {

        notificacion.showInfo();
        System.out.println("Notificacion dirigida a: " + this.getName());
    }

    @Override
    public boolean getPrecioLlamadas() {
        return precioLlamadas;
    }

    @Override
    public boolean getNoticia() {
        return noticia;
    }

    @Override
    public boolean getPremio() {
        return premios;
    }

    @Override
    public boolean getPromociones() {
        return promociones;
    }

    public void setPrecioLlamadas(boolean precioLlamadas) {
        this.precioLlamadas = precioLlamadas;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    public void setPremios(boolean premios) {
        this.premios = premios;
    }

    public void setNoticia(boolean noticia) {
        this.noticia = noticia;
    }
}
