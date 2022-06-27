package structural.decorator.example;

public class PluginDebug extends PluginIDE {

    public PluginDebug(Ide ide, int costPlugin, boolean isOpenSource) {
        super(ide, costPlugin, isOpenSource);
    }

    @Override
    public void showInformation() {
        int newCost = costPlugin + Ide.getCost();
        Ide.setCost(newCost);
        super.showInformation();
        infoPlugin();
    }

    public void infoPlugin() {
        System.out.println(">>> PlugginDebug");
        System.out.println("open source: " + isOpenSource);
        System.out.println("cost plugin: " + costPlugin);
    }

    @Override
    public void setCost(int cost) {
        this.costPlugin = cost;
    }

    @Override
    public int getCost() {
        return this.costPlugin;
    }

}
