package Sort;

/**
 * Created by Andrey on 13.02.2015.
 */
public class InsertionSort {

    public static int[] sort(int[] array){
        int currentElement;
        int prevIndex;
        for(int i = 1; i < array.length; i++){
            currentElement = array[i];
            prevIndex = i - 1;
            while(prevIndex >= 0 && array[prevIndex] > currentElement){
                array[prevIndex+1] = array[prevIndex];
                array[prevIndex] = currentElement;
                prevIndex--;
            }
        }
        return array;
    }

}
