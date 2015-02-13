package Sort;

/**
 * Created by Andrey on 13.02.2015.
 */
public class SelectionSort {

    public static int[] sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int index = i;
            //find min/max
            for(int j = i + 1; j < array.length; j++)
                if(array[j] < array[index])
                    index = j;

            int small = array[index];
            array[index] = array[i];
            array[i] = small;
        }
        return array;
    }

}
