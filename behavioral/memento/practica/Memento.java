package behavioral.memento.practica;

public class Memento {

    private BaseDatos state;

    public Memento(BaseDatos baseDatos) {
        state = baseDatos;
    }

    public BaseDatos getState() {
        return state;
    }
}
