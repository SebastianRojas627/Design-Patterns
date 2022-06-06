package behavioral.chainResponsibility.examples;

public class Segip implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {

        if (persona.isCertiNacimiento() && persona.isPagoBanco() && persona.isFichaAtencion()) {
            System.out.println("\n Todos los requisitos cumplidos, SEGIP emite el carnet de identidad");

        } else {
            next.criteriaHandler(persona);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
