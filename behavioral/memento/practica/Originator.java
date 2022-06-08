package behavioral.memento.practica;

public class Originator {

    private BaseDatos state;

    public void setAlias(BaseDatos state) {
        this.state = state;
    }

    public Memento createAlias() {
        return new Memento(state);
    }

    public BaseDatos restoreAlias(Memento m) {
        System.out.println("\n ***** RESTORING **** \n");
        this.state = m.getState();
        return this.state;
    }
}
