package behavioral.state.example;

public class PrendioMinando implements IStateComputer {

    @Override
    public void resourceManager(Computer computer) throws InterruptedException {
        System.out.println("INFO> Estado PrendioMinando - Resources: ");
        int currentValue = computer.getTarjetaVideo().getCapacidadUtiliza();
        while (computer.getTarjetaVideo().getCapacidadUtiliza() < 100) {
            computer.getTarjetaVideo().showInfo();
            Thread.sleep(5000);
            currentValue = currentValue + 5;
            computer.getTarjetaVideo().setCapacidadUtiliza(currentValue);

        }
        computer.getTarjetaVideo().setCapacidadUtiliza(100);
        System.out.println("100% de uso");
    }
}