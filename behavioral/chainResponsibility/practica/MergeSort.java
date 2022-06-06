package behavioral.chainResponsibility.practica;

public class MergeSort implements IHandler {

    private IHandler next;

    public void merge(Persona arr[], int left, int middle, int right) {
        int low = middle - left + 1;                    //size of the left subarray
        int high = right - middle;                      //size of the right subarray

        Persona L[] = new Persona[low];                             //create the left and right subarray
        Persona R[] = new Persona[high];

        int i = 0, j = 0;

        for (i = 0; i < low; i++)                               //copy elements into left subarray
        {
            L[i] = arr[left + i];
        }
        for (j = 0; j < high; j++)                              //copy elements into right subarray
        {
            R[j] = arr[middle + 1 + j];
        }


        int k = left;                                           //get starting index for sort
        i = 0;                                             //reset loop variables before performing merge
        j = 0;

        while (i < low && j < high)                     //merge the left and right subarrays
        {
            if (L[i].getEdad() <= R[j].getEdad()) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < low)                             //merge the remaining elements from the left subarray
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < high)                           //merge the remaining elements from right subarray
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public void mergeSort(Persona arr[], int left, int right)       //helper function that creates the sub cases for sorting
    {
        int middle;
        if (left < right) {                             //sort only if the left index is lesser than the right index (meaning that sorting is done)
            middle = (left + right) / 2;

            mergeSort(arr, left, middle);                    //left subarray
            mergeSort(arr, middle + 1, right);               //right subarray

            merge(arr, left, middle, right);                //merge the two subarrays
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

        if (personas.length <= 20) {
            Persona[] solucion;
            mergeSort(personas, 0, personas.length - 1);
            System.out.println("\n Ordenamiento realizado por algoritmo MergeSort");
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
