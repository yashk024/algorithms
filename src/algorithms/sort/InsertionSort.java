package algorithms.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] array) {
        int key, j;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 1, 2, 3, 0 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
