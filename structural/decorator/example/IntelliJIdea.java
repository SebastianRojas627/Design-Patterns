package structural.decorator.example;

public class IntelliJIdea implements Ide {
    private String license;
    private String size;
    private String version;
    private int cost;

    public IntelliJIdea(String license, String size, String version, int cost) {
        this.license = license;
        this.size = size;
        this.version = version;
        this.cost = cost;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }


    @Override
    public void showInformation() {
        System.out.println("*** IntelliJIdea");
        System.out.println("license: " + license);
        System.out.println("size: " + size);
        System.out.println("version: " + version);
        System.out.println("cost: " + cost);

    }
}
