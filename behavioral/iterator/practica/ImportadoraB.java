package behavioral.iterator.practica;

import java.util.ArrayList;
import java.util.List;

public class ImportadoraB implements Importadoras {

    private List<Automovil> automoviles;

    public ImportadoraB() {
        automoviles = new ArrayList<>();
    }

    public void add(Automovil auto) {
        automoviles.add(auto);
    }

    @Override
    public ConcreteIteratorB createIterator() {
        return new ConcreteIteratorB(automoviles);
    }
}