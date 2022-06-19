package structural.adapter.practica;

import java.sql.Ref;

public class Refrigerador implements Artefactos2{

    public int costo;
    public String tiempoGarantia;

    public Refrigerador(int costo, String tiempoGarantia) {

        this.costo = costo;
        this.tiempoGarantia = tiempoGarantia;
    }

    @Override
    public void getCosto() {
        System.out.println("Costo refrigerador es: " + costo);
    }

    @Override
    public void getTiempoGarantia() {
        System.out.println("Tiempo de garantia de refrigerador es: " + tiempoGarantia);
    }
}