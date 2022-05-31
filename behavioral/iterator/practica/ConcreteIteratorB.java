package behavioral.iterator.practica;

import java.util.List;

public class ConcreteIteratorB implements Iterator {

    private List<Automovil> automoviles;
    private int position;

    public ConcreteIteratorB(List<Automovil> automoviles) {
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
