package behavioral.state.example;

public class MemoriaRam {

    String capacidadTotal;
    int capacidadUtiliza;
    String description;

    public MemoriaRam() {
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

    public MemoriaRam setCapacidadTotal(String capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        return this;
    }

    public MemoriaRam setCapacidadUtiliza(int capacidadUtiliza) {
        this.capacidadUtiliza = capacidadUtiliza;
        return this;
    }

    public MemoriaRam setDescription(String description) {
        this.description = description;
        return this;
    }

    public void showInfo() {
        System.out.println("**** memoria ram ****");
        System.out.println("capacidadTotal: " + capacidadTotal);
        System.out.println("capacidadUtiliza: " + capacidadUtiliza);
        System.out.println("description: " + description);
    }
}