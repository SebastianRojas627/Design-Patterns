package singleton.structure;

import java.util.Date;

public class Singleton1 {
    //atributos estaticos y privados
    private static Singleton1 instance;

    //constructor privado
    private Singleton1() {
        System.out.println("Creando mi singleton...");
        //logic
    }

    //metodo publico para acceso global
    public static Singleton1 getInstance() {

        if (instance == null)
            instance = new Singleton1();
        return instance;
    }

    public void time() {
        System.out.println("time: " + new Date());
    }

    public void resetSingleton() {
        instance = null;
    }
}
