package behavioral.chainResponsibility.practica;

public interface IHandler {

    void setNext(IHandler handler);

    void criteriaHandler(Persona[] personas);

    IHandler next();

}
