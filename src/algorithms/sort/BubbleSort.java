package algorithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] array) {
        int n = array.length - 1, new_n;
        do {
            new_n = 0;
            for (int j = 0; j < n; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    new_n = j;
                }
            }
            n = new_n;
        } while (n > 0);
    }

    private static void swap(int[] array, int i, int j) {
        array[i] = (array[i] ^ array[j]) ^ (array[j] = array[i]);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 1, 2, 3, 0 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
