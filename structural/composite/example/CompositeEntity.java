package structural.composite.example;

import java.util.ArrayList;
import java.util.List;

public class CompositeEntity extends Component {

    private List<Component> componentList = new ArrayList<>();

    public CompositeEntity(String type) {
        super(type);
    }


    @Override
    public void detailAgileBoard() {
        int tmpEstimation = 0;
        this.showInformation();
        for (Component component : componentList) {
            component.detailAgileBoard();
            tmpEstimation = tmpEstimation + component.getEstimation();
        }
        this.setEstimation(tmpEstimation);
        //todo
        System.out.println("" + this.getType() + "*** Estimation ***** " + tmpEstimation);
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
