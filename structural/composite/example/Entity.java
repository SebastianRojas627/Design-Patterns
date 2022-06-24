package structural.composite.example;

public class Entity extends Component {

    public Entity(String type) {
        super(type);
    }

    @Override
    public void detailAgileBoard() {
        this.showInformation();
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