package algorithms.sort;

import java.util.Arrays;

public class BinaryInsertionSort {

    public static void sort(int[] array) {
        int key, left, right, mid;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            left = 0;
            right = i;

            while (left < right) {
                mid = left + ((right - left) >> 1);
                if (key < array[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            System.arraycopy(array, right, array, right + 1, i - right);
            array[right] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
