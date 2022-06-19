package structural.adapter.practica;

public class Adapter implements Artefactos1{

    private Artefactos2 artefacto;

    public Adapter(Artefactos2 artefacto) {

        this.artefacto = artefacto;
    }

    @Override
    public void getPrecio() {
        artefacto.getCosto();
    }

    @Override
    public void getTiempoVida() {
        artefacto.getTiempoGarantia();
    }

}
