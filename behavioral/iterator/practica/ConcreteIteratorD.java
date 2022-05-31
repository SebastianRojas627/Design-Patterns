package behavioral.iterator.practica;

import java.util.Stack;

public class ConcreteIteratorD implements Iterator {

    private Stack<Automovil> automoviles;

    public ConcreteIteratorD(Stack<Automovil> automoviles) {
        this.automoviles = automoviles;
    }

    @Override
    public Object next() {
        return automoviles.pop();
    }

    @Override
    public boolean hasNext() {
        return !automoviles.isEmpty();
    }
}
