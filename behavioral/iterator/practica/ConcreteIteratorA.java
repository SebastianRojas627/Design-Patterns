package behavioral.iterator.practica;

public class ConcreteIteratorA implements Iterator {

    private int position;
    private Automovil[] automoviles;

    public ConcreteIteratorA(Automovil[] automoviles) {
        this.automoviles = automoviles;
    }

    @Override
    public Object next() {
        return automoviles[position++];
    }

    @Override
    public boolean hasNext() {
        return automoviles.length != 0 && position < automoviles.length;
    }
}
