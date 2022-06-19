package structural.adapter.example;

import java.awt.*;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        IAutomovil autoG = new Gasolina();
        IAutomovil autoGE = new GasolinaEspecial();
        IAutomovil autoD = new Diesel();
        IAutomovil autoA = new AutomovilElectrico(new Automovil());


        autoG.prender();
        autoG.marcha(15);
        autoG.cargando(5);

        autoA.prender();
        autoA.marcha(15);
        autoA.cargando(5);

    }
}