package Sort;

/**
 * Created by Andrey on 13.02.2015.
 */
public class Starter{
    public static void main(String[] args){

        int array[] = {1,4,8,3,2,5,7,6};
        showArray(array);
        QuickSort.sort(array);
        BubbleSort.sort(array);
        HeapSort.sort(array);
        InsertionSort.sort(array);
        MergeSort.sort(array);
        SelectionSort.sort(array);
        showArray(SelectionSort.sort(array));
    }

    public static void showArray(int[] array){
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
