package behavioral.strategy.practica;

import java.util.List;

public class Primavera implements IEstacion {

    @Override
    public void nuevaEstacion(List<Ropa> prendas) {
        System.out.println("\n ***PRIMAVERA***");
        for (Ropa ropa : prendas) {

            ropa.showInfo();

        }
    }
}
