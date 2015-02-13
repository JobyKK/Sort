package Sort;

/**
 * Created by Andrey on 14.02.2015.
 */
public class HeapSort {
    public static void sort(int[] a) {
        buildHeap(a);
        int length = a.length - 1;
        while (length > 0) {
            swap(a, 0, length);
            heapify(a, length, 0);
            length--;
        }
    }

    private static void buildHeap(int[] a) {
        for (int i = a.length / 2; i >= 0; i--) {
            heapify(a, a.length, i);
        }
    }

    private static void heapify(int[] a, int length, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < length && a[i] < a[l]) {
            largest = l;
        }
        if (r < length && a[largest] < a[r]) {
            largest = r;
        }
        if (i != largest) {
            swap(a, i, largest);
            heapify(a, length, largest);
        }
    }


    private static int right(int i) {
        return 2 * i + 1;
    }

    private static int left(int i) {
        return 2 * i + 2;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
