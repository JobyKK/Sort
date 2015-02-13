package Sort;

/**
 * Created by Andrey on 13.02.2015.
 */
public class MergeSort {

    private static int[] array = null;
    private static int[] help = null;
    private static int number;

    public static int[] sort(int[] array){
        MergeSort.array = array;
        number = array.length;
        help = new int[number];
        mergesort(0, number - 1);
        return array;
    }

    private static void mergesort(int low, int high) {

        if(low < high){
            int middle = low + (high - low)/2;
            mergesort(low, middle);
            mergesort(middle + 1, high);
            merge(low, middle, high);
        }

    }

    private static void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            help[i] = array[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (help[i] <= help[j]) {
                array[k] = help[i];
                i++;
            } else {
                array[k] = help[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            array[k] = help[i];
            k++;
            i++;
        }

    }

}
