package algorithms.sort;

import java.util.Arrays;

public class CountingSort {

    public static void sort(int[] array) {

        // Find the minimum and maximum values in the input array
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }

        // Create an auxiliary array to hold the occurrences of each element
        int[] aux = new int[max - min + 1];

        // Count occurrences of each element in the input array
        for (int e : array) {
            aux[e - min]++;
        }

        // Update the auxiliary array to determine the final position of each element
        for (int i = 1; i < aux.length; i++) {
            aux[i] += aux[i - 1];
        }

        // Create a clone of the input array to preserve the original order
        int[] clone = array.clone();

        // Sort the input array based on the counts in the auxiliary array
        for (int i = clone.length - 1; i >= 0; i--) {
            array[--aux[clone[i] - min]] = clone[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 1, 2, 3, 0 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
