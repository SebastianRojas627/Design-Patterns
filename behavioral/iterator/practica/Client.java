package behavioral.iterator.practica;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        Map<Integer, Automovil> automoviles = new HashMap<>();
        int key = 0;
        Automovil a1 = new Automovil(5000, 4, "Susuki", "vagoneta");
        Automovil a2 = new Automovil(6000, 5, "Audi", "SUV");
        Automovil a3 = new Automovil(7000, 6, "Toyota", "camioneta");
        Automovil a4 = new Automovil(8000, 4, "Mitsubishu", "vagoneta");
        Automovil a5 = new Automovil(9000, 5, "Ford", "SUV");
        Automovil a6 = new Automovil(5500, 6, "BMW", "camioneta");
        Automovil a7 = new Automovil(6500, 4, "Mercedes", "vagoneta");
        Automovil a8 = new Automovil(7500, 5, "Jaguar", "SUV");
        Automovil a9 = new Automovil(8500, 6, "Tesla", "camioneta");
        Automovil a10 = new Automovil(9500, 4, "Ferrari", "vagoneta");
        Automovil a11 = new Automovil(4500, 5, "BMW", "SUV");
        Automovil a12 = new Automovil(4000, 6, "Audi", "camioneta");

        ImportadoraA ia = new ImportadoraA();
        ia.add(a1);
        ia.add(a2);
        ia.add(a3);

        ImportadoraB ib = new ImportadoraB();
        ib.add(a4);
        ib.add(a5);
        ib.add(a6);

        ImportadoraC ic = new ImportadoraC();
        ic.add(a7);
        ic.add(a8);
        ic.add(a9);

        ImportadoraD id = new ImportadoraD();
        id.add(a10);
        id.add(a11);
        id.add(a12);

        Iterator iterator;
        iterator = ia.createIterator();

        while (iterator.hasNext()) {
            Automovil auto = (Automovil) iterator.next();
            automoviles.put(key++, auto);
            System.out.println("Auto registrado de marca: " + auto.getModelo() + " registrado correctamente");
        }

        iterator = ib.createIterator();

        while (iterator.hasNext()) {
            Automovil auto = (Automovil) iterator.next();
            automoviles.put(key++, auto);
            System.out.println("Auto registrado de marca: " + auto.getModelo() + " registrado correctamente");
        }

        iterator = ic.createIterator();

        while (iterator.hasNext()) {
            Automovil auto = (Automovil) iterator.next();
            automoviles.put(key++, auto);
            System.out.println("Auto registrado de marca: " + auto.getModelo() + " registrado correctamente");
        }

        iterator = id.createIterator();

        while (iterator.hasNext()) {
            Automovil auto = (Automovil) iterator.next();
            automoviles.put(key++, auto);
            System.out.println("Auto registrado de marca: " + auto.getModelo() + " registrado correctamente");
        }

        for(int i = 0; i < automoviles.size(); i++) {
            automoviles.get(i).getInfo();
        }

    }
}
