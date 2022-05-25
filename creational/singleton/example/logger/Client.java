package creational.singleton.example.logger;

public class Client {
    private String name;
    private String ci;
    private String points;

    public Client() {
        Logger.getInstance().info("Creation Client");
    }

    public String getName() {
        Logger.getInstance().info("Client - getName " + name);
        return name;
    }

    public void setName(String name) {
        Logger.getInstance().info("Client - setName " + name);
        this.name = name;
    }

    public String getCi() {
        Logger.getInstance().info("Client - getCi " + ci);
        return ci;
    }

    public void setCi(String ci) {
        Logger.getInstance().info("Client - setCi " + ci);
        this.ci = ci;
    }

    public String getPoints() {
        Logger.getInstance().info("Client - getPoints " + points);
        return points;
    }

    public void setPoints(String points) {
        Logger.getInstance().info("Client - setPoints " + points);
        this.points = points;
    }
}