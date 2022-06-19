package structural.adapter.example;

public class Automovil implements IElectricos {

    private int bateria = 0;
    private String estadoBateria;

    public Automovil() {
        estadoBateria = "nuevo";
    }

    @Override
    public void encender() {
        System.out.println("revisando bateria ..");
        this.estadoBaterio();
    }

    @Override
    public void funcionando(int tiempoMarcha) throws InterruptedException {
        for (int i = 0; i < tiempoMarcha; i = i + 5) {
            estadoBateria = "medio uso";
            bateria = bateria - 2;
            Thread.sleep(5000);
            if (bateria <= 0) {
                System.out.println("Automovil electrico> se quedo sin bateria: estado actual: 0%");
                bateria = 0;
                break;
            }
        }
    }

    @Override
    public void cargando(int tiempo) {
        System.out.println("estado APAGADO");
        this.estadoBaterio();
        for (int i = 0; i < tiempo; i++) {
            bateria = bateria + 2;
            System.out.println("Automovil electrico: cargando bateria ..." + bateria + "%");
            if (bateria >= 100) {
                System.out.println("Automovil electrico> estado actual: 100%");
                bateria = 100;
                break;
            }
        }
        System.out.println("bateria cargado : " + bateria + "%");
    }

    @Override
    public void estadoBaterio() {
        System.out.println("estado de la bateria: " + estadoBateria);
    }
}