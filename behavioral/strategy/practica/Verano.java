package behavioral.strategy.practica;

import java.util.List;

public class Verano implements IEstacion {

    @Override
    public void nuevaEstacion(List<Ropa> prendas) {
        System.out.println("\n ***VERANO***");
        for (Ropa ropa : prendas) {

            double ini = ropa.getPrecioI();
            double aumento = ini * 0.1;
            ropa.setPrecioF(ini - aumento);
            ropa.showInfo();

        }
    }
}
