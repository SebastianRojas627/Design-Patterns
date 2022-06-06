package behavioral.chainResponsibility.examples;

public class Banco implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {

        if (persona.isCertiNacimiento() && !persona.isPagoBanco() && persona.isFichaAtencion()) {
            System.out.println("\n Falta pago al banco, problema solucionado por Banco");

        } else {
            next.criteriaHandler(persona);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
