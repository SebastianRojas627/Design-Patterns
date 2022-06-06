package behavioral.chainResponsibility.examples;

public class OrganizadorFichas implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {

        if (persona.isCertiNacimiento() && persona.isPagoBanco() && !persona.isFichaAtencion()) {
            System.out.println("\n Falta ficha de atencion, problema solucionado por Organizador de fichas");

        } else {
            next.criteriaHandler(persona);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
