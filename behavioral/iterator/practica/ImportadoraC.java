package behavioral.iterator.practica;

import java.util.Vector;

public class ImportadoraC implements Importadoras {

    private Vector<Automovil> automoviles;

    public ImportadoraC() {
        automoviles = new Vector<>();
    }

    public void add(Automovil auto) {
        automoviles.add(auto);
    }

    @Override
    public ConcreteIteratorC createIterator() {
        return new ConcreteIteratorC(automoviles);
    }
}
