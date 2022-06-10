package behavioral.strategy.practica;

import java.util.List;

public class Otono implements IEstacion {

    @Override
    public void nuevaEstacion(List<Ropa> prendas) {
        System.out.println("\n ***OTONO***");
        for (Ropa ropa : prendas) {

            double ini = ropa.getPrecioI();
            ropa.setPrecioF(ini/2);
            ropa.showInfo();

        }
    }
}
