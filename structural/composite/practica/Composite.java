package structural.composite.practica;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    private List<Component> componentList = new ArrayList<>();

    public Composite(String type) {
        super(type);
    }

    @Override
    public int getPrecio() {
        int total = 0;
        for(Component component: componentList) {
            total = total + component.getPrecio();
        }
        return total;
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component getChild(int position) {
        return componentList.get(position);
    }
}
