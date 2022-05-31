package behavioral.iterator.practica;

import java.util.Stack;

public class ImportadoraD implements Importadoras {

    private Stack<Automovil> automoviles;

    public ImportadoraD() {
        automoviles = new Stack<>();
    }

    public void add(Automovil auto) {
        automoviles.push(auto);
    }

    @Override
    public ConcreteIteratorD createIterator() {
        return new ConcreteIteratorD(automoviles);
    }
}
