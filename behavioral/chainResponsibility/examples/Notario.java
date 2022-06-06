package behavioral.chainResponsibility.examples;

public class Notario implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {

        if (!persona.isCertiNacimiento() && persona.isPagoBanco() && persona.isFichaAtencion()) {
            System.out.println("\n Falta certificado de nacimiento, problema solucionado por Notario");

        } else {
            next.criteriaHandler(persona);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
