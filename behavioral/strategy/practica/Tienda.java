package behavioral.strategy.practica;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String name;
    private List<Ropa> prendas = new ArrayList<>();
    private IEstacion estacion;

    public Tienda(String name) {

        this.name = name;
    }

    public void addPrenda(Ropa ropa) {

        prendas.add(ropa);
    }

    public IEstacion getEstacion() {
        return estacion;
    }

    public void setEstacion(IEstacion estacion) {
        this.estacion = estacion;
    }

    public void cambiarEstacion() {
        estacion.nuevaEstacion(prendas);
    }
}
