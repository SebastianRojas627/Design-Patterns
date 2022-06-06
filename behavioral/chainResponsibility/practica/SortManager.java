package behavioral.chainResponsibility.practica;

public class SortManager implements IHandler{

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {

        MergeSort resp1 = new MergeSort();
        this.setNext(resp1);

        HeapSort resp2 = new HeapSort();
        resp1.setNext(resp2);

        InsertionSort respFinal = new InsertionSort();
        resp2.setNext(respFinal);

        this.next.criteriaHandler(personas);

    }

    @Override
    public IHandler next() {
        return next;
    }
}
