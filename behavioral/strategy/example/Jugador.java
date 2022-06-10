package behavioral.strategy.example;

public class Jugador {

    String name;
    String position;
    String mode;


    public Jugador(String name, String position) {

        this.name = name;
        this.position = position;
        this.mode = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void info() {

        System.out.println("* JUGADOR > name: " + name);
        System.out.println("JUGADOR > position: " + position);
        System.out.println("JUGADOR > modo: " + mode);
    }
}