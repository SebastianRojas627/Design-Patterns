package behavioral.chainResponsibility.examples;

import behavioral.chainResponsibility.structure.ConcreteHandler1;
import behavioral.chainResponsibility.structure.ConcreteHandler2;
import behavioral.chainResponsibility.structure.ConcreteHandler3;
import behavioral.chainResponsibility.structure.ConcreteHandler4;

public class Manager implements IHandler {

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona persona) {

        Segip resp1 = new Segip();
        this.setNext(resp1);

        Notario resp2 = new Notario();
        resp1.setNext(resp2);

        Banco resp3 = new Banco();
        resp2.setNext(resp3);

        OrganizadorFichas resp4 = new OrganizadorFichas();
        resp3.setNext(resp4);

        AtencionCliente respFinal = new AtencionCliente();
        resp4.setNext(respFinal);

        this.next.criteriaHandler(persona);

    }

    @Override
    public IHandler next() {
        return next;
    }
}
