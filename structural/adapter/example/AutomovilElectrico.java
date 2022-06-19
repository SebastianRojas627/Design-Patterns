package structural.adapter.example;

public class AutomovilElectrico implements IAutomovil {

    private Automovil automovil;

    public AutomovilElectrico(Automovil automovil) {
        this.automovil = automovil;
    }

    @Override
    public void prender() {
        automovil.encender();
    }

    @Override
    public void marcha(int tiempoMarcha) throws InterruptedException {
        automovil.funcionando(tiempoMarcha);
    }

    @Override
    public void cargando(int tiempo) {
        automovil.cargando(tiempo);
    }
}