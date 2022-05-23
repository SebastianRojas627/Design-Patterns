package singleton.example.banco;

import singleton.structure.Singleton3;

public class ManagerSaldo {
    private static ManagerSaldo managerSaldo;
    private int saldo;

    private ManagerSaldo() {
        saldo = 900;
        System.out.println("Inicial Saldo: " + saldo);
    }


    private synchronized static void multiThreadControl() {
        if (managerSaldo == null)
            managerSaldo = new ManagerSaldo();
    }


    public static ManagerSaldo getInstance() {
        if (managerSaldo == null)
            multiThreadControl();
        return managerSaldo;
    }

    public synchronized void retiroDinero(int cantidad) {
        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("cantidad a retirar: [" + cantidad + "] saldo despues del retiro[" + saldo + "]");
        } else {
            System.out.println("ERROR! Cantidad a retirar: " + cantidad + "saldo actual " + saldo);
        }
    }
}