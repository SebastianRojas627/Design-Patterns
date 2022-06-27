package structural.decorator.example;

public class PluginDeploy extends PluginIDE {

    public PluginDeploy(Ide ide, int costPlugin, boolean isOpenSource) {
        super(ide, costPlugin, isOpenSource);
    }

    @Override
    public void showInformation() {
        int newCost = costPlugin + Ide.getCost();
        Ide.setCost(newCost);
        super.showInformation();
        infoPlugin();
    }

    @Override
    public void setCost(int cost) {
        this.costPlugin = cost;
    }

    @Override
    public int getCost() {
        return this.costPlugin;
    }

    public void infoPlugin() {
        System.out.println(">>> PlugginDeploy");
        System.out.println("open source: " + isOpenSource);
        System.out.println("cost plugin: " + costPlugin);
    }

}
