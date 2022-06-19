package structural.adapter.practica;

public class Televisor implements Artefactos2{

    public int costo;
    public String tiempoGarantia;

    public Televisor(int costo, String tiempoGarantia) {

        this.costo = costo;
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void getCosto() {
        System.out.println("Costo televisor es: " + costo);
    }

    @Override
    public void getTiempoGarantia() {
        System.out.println("Tiempo de garantia de televisor es: " + tiempoGarantia);
    }
}
