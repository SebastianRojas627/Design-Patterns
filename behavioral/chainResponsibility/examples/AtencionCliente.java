package behavioral.chainResponsibility.examples;

public class AtencionCliente implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {

        System.out.println("\n Mas de un requisito faltante, problema solucionado en Atencion al cliente");
    }

    @Override
    public IHandler next() {
        return next;
    }
}
