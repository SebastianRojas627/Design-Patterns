package behavioral.iterator.practica;

import java.util.Vector;

public class ConcreteIteratorC implements Iterator {

    private Vector<Automovil> automoviles;
    private int position;

    public ConcreteIteratorC(Vector<Automovil> automoviles) {
        this.automoviles = automoviles;
        position = 0;
    }

    @Override
    public Object next() {
        return automoviles.get(position++);
    }

    @Override
    public boolean hasNext() {
        return automoviles.size() != 0 && position < automoviles.size();
    }
}

