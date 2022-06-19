package structural.adapter.practica;

public class Lavadora implements Artefactos2{

    public int costo;
    public String tiempoGarantia;

    public Lavadora(int costo, String tiempoGarantia) {

        this.costo = costo;
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void getCosto() {
        System.out.println("Costo lavadora es: " + costo);
    }

    @Override
    public void getTiempoGarantia() {
        System.out.println("Tiempo de garantia de lavadora es: " + tiempoGarantia);
    }
}
