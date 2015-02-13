package Sort;

/**
 * Created by Andrey on 13.02.2015.
 */
public class QuickSort {

    private static int[] array = null;

    public static int[] sort(int[] array){
        QuickSort.array = array;
        quicksort(0, array.length - 1);

        return array;
    }

    public static void quicksort(int low, int high){

        int i = low,
                j = high;
        int centralElement = array[low + (high - low)/2];

        while( i <= j){
            while(array[i] < centralElement)
                i++;
            while(array[j] > centralElement)
                j--;
            if( i <= j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

}
