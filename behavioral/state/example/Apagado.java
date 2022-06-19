package behavioral.state.example;

public class Apagado implements IStateComputer {

    @Override
    public void resourceManager(Computer computer) throws InterruptedException {
        System.out.println("INFO> Estado Apagado - Resources: ");
        computer.getTarjetaVideo().setCapacidadUtiliza(0);
        computer.getMemoriaRam().setCapacidadUtiliza(0);
        computer.getTarjetaVideo().showInfo();
        computer.getMemoriaRam().showInfo();
    }
}