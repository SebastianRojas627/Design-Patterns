package behavioral.visitor.practica;

public interface IPais {

    void accept(IVisitante visitante, double cantidad, boolean aDolar);
}
