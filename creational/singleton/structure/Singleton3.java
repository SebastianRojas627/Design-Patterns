package creational.singleton.structure;

import java.util.Date;

public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {
        System.out.println("Creando mi singleton...");
    }

    private static void multiThreadControl() {
        if (instance == null)
            instance = new Singleton3();
    }

    public synchronized static Singleton3 getInstance() {
        //synchronized pone threads en cola para ejecutarlos 1 a 1
        if (instance == null)
            multiThreadControl();
        return instance;
    }

    public void time() {
        System.out.println("time: " + new Date());
    }

    public void resetSingleton() {
        instance = null;
    }
}
