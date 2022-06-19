package behavioral.state.example;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        Computer computer = new Computer();
        computer.setStateComputer(new PrendioMinando());
        computer.resourceManager();

    }

}