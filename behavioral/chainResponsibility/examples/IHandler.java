package behavioral.chainResponsibility.examples;

public interface IHandler {

    void setNext(IHandler handler);

    void criteriaHandler(Persona persona);

    IHandler next();

}
