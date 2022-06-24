package structural.composite.practica;

public class Computadora extends Component{

    public int precio;

    public Computadora() {
        super("computadora");
        precio = 100;
    }

    @Override
    public int getPrecio() {
       return precio;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int position) {
        return null;
    }
}
