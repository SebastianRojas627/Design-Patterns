package behavioral.visitor.practica;

public class Brasil implements IPais{

    @Override
    public void accept(IVisitante visitante, double cantidad, boolean aDolar) {

        visitante.realizarCambio(this, aDolar, cantidad);
    }
}

