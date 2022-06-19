package behavioral.state.example;

import java.util.Random;

public class PrendioUsandoProgrma implements IStateComputer {

    @Override
    public void resourceManager(Computer computer) throws InterruptedException {
        System.out.println("INFO> Estado PrendioUsandoProgrma - Resources: ");
        computer.getMemoriaRam().setCapacidadUtiliza(new Random().nextInt(100));
        computer.getMemoriaRam().showInfo();
    }
}