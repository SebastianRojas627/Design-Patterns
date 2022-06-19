package behavioral.state.example;

public class TarjetaVideo {

    String capacidadTotal;
    int capacidadUtiliza;
    String description;

    public TarjetaVideo() {
    }

    public String getCapacidadTotal() {
        return capacidadTotal;
    }

    public int getCapacidadUtiliza() {
        return capacidadUtiliza;
    }

    public String getDescription() {
        return description;
    }

    public TarjetaVideo setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public TarjetaVideo setCapacidadUtiliza(int capacidadUtiliza) {
        this.capacidadUtiliza = capacidadUtiliza;
        return this;
    }

    public TarjetaVideo setDescription(String description) {
        this.description = description;
        return this;
    }

    public void showInfo() {
        System.out.println("**** targeta video ****");
        System.out.println("capacidadTotal: " + capacidadTotal);
        System.out.println("capacidadUtiliza: " + capacidadUtiliza);
        System.out.println("description: " + description);
    }
}