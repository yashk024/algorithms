package algorithms.search;

public class BinarySearch {

    public static int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (array[mid] == target) {
                return mid;
            }
            if (target < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            arr[i - 1] = 57 * i;
        }
        int target = 5301;
        int index = search(arr, target);
        System.out.println(index);
    }

}
