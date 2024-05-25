package algorithms.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] array) {
        int minIndex;
        for (int i = 0; i < array.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // int key = array[minIndex];
            // while (minIndex > i) {
            // array[minIndex] = array[--minIndex];
            // }
            // array[i] = key;

            swap(array, minIndex, i);
        }
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
