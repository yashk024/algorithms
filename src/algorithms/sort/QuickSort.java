package algorithms.sort;

import java.util.Arrays;

public class QuickSort {

    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int part = partition(array, left, right);
            quickSort(array, left, part);
            quickSort(array, part + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[left + ((right - left) >> 1)];
        while (true) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left >= right) {
                return right;
            }
            swap(array, left++, right--);
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
