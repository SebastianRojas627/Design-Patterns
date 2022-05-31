package behavioral.iterator.practica;

public class ImportadoraA implements Importadoras{

    private Automovil[] automoviles;
    private int position;

    public ImportadoraA() {
        automoviles = new Automovil[3];
        position = 0;
    }

    public void add(Automovil auto) {
        automoviles[position] = auto;
        position++;
    }

    @Override
    public ConcreteIteratorA createIterator() {
        return new ConcreteIteratorA(automoviles);
    }
}
