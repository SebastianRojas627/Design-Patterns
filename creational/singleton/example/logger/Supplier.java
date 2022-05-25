package creational.singleton.example.logger;

public class Supplier {
    private String name;
    private String address;
    private String phone;

    public Supplier() {
        Logger.getInstance().info("Creation Supplier");
    }

    public String getName() {
        Logger.getInstance().info("Supplier getName: " + name);
        return name;
    }

    public void setName(String name) {
        Logger.getInstance().info("Supplier setName: " + name);
        this.name = name;
    }

    public String getAddress() {
        Logger.getInstance().info("Supplier getAddress: " + address);
        return address;
    }

    public void setAddress(String address) {
        Logger.getInstance().info("Supplier setAddress: " + address);
        this.address = address;
    }

    public String getPhone() {
        Logger.getInstance().info("Supplier getPhone: " + phone);
        return phone;
    }

    public void setPhone(String phone) {
        Logger.getInstance().info("Supplier setPhone: " + phone);
        this.phone = phone;
    }
}