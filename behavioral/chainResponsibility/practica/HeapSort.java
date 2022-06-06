package behavioral.chainResponsibility.practica;

public class HeapSort implements IHandler {

    private IHandler next;

    public void heapSort(Persona arr[]) {
        Persona temp;

        for (int i = arr.length / 2 - 1; i >= 0; i--)                //build the heap
        {
            heapify(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i > 0; i--)                            //extract elements from the heap
        {
            temp = arr[0];                                                  //move current root to end (since it is the largest)
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);                                             //recall heapify to rebuild heap for the remaining elements
        }
    }

    public void heapify(Persona arr[], int n, int i) {
        int MAX = i; // Initialize largest as root
        int left = 2 * i + 1; //index of the left child of ith node = 2*i + 1
        int right = 2 * i + 2; //index of the right child of ith node  = 2*i + 2
        Persona temp;

        if (left < n && arr[left].getEdad() > arr[MAX].getEdad())            //check if the left child of the root is larger than the root
        {
            MAX = left;
        }

        if (right < n && arr[right].getEdad() > arr[MAX].getEdad())            //check if the right child of the root is larger than the root
        {
            MAX = right;
        }

        if (MAX != i) {                                               //repeat the procedure for finding the largest element in the heap
            temp = arr[i];
            arr[i] = arr[MAX];
            arr[MAX] = temp;
            heapify(arr, n, MAX);
        }
    }

    public void display(Persona arr[])                 //display the array
    {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i].getEdad() + " ");
        }
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {

        if (personas.length <= 50) {
            Persona[] solucion;
            heapSort(personas);
            System.out.println("\n Ordenamiento realizado por algoritmo HeapSort");
            display(personas);
            System.out.println();
        } else {
            next.criteriaHandler(personas);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
