package behavioral.chainResponsibility.practica;

public class InsertionSort implements IHandler{

    private IHandler next;

    static void insertionSort(Persona arr[], int n)
    {
        if (n <= 1)                             //passes are done
        {
            return;
        }

        insertionSort( arr, n-1 );        //one element sorted, sort the remaining array

        Persona last = arr[n-1];                        //last element of the array
        int j = n-2;                                //correct index of last element of the array

        while (j >= 0 && arr[j].getEdad() > last.getEdad())                 //find the correct index of the last element
        {
            arr[j+1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
            j--;
        }
        arr[j+1] = last;                            //set the last element at its correct index
    }

    public void display(Persona arr[])                 //display the array
    {
        for (int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i].getEdad() + " ");
        }
    }

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {

        if (personas.length > 50) {
            Persona[] solucion;
            insertionSort(personas, personas.length);
            System.out.println("\n Ordenamiento realizado por algoritmo InsertionSort");
            display(personas);
            System.out.println();
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
