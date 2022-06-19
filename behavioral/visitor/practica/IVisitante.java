package behavioral.visitor.practica;

public interface IVisitante {

    void realizarCambio(Bolivia bolivia, boolean aDolar, double cantidad);

    void realizarCambio(Argentina argentina, boolean aDolar, double cantidad);

    void realizarCambio(Brasil brasil, boolean aDolar, double cantidad);

    void realizarCambio(Italia italia, boolean aDolar, double cantidad);
}
