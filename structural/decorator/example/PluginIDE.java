package structural.decorator.example;

public class PluginIDE implements Ide {

    protected Ide Ide;
    protected int costPlugin;
    protected boolean isOpenSource;

    public PluginIDE(Ide ide, int costPlugin, boolean isOpenSource) {
        Ide = ide;
        this.costPlugin = costPlugin;
        this.isOpenSource = isOpenSource;
    }

    @Override
    public void showInformation() {
        Ide.showInformation();
    }

    @Override
    public void setCost(int costPlugin) {
        this.costPlugin = costPlugin;
    }

    @Override
    public int getCost() {
        return costPlugin;
    }

}
