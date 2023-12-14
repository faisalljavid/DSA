package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-18, -4, -1, 0, 32, 56, 222};
        int target = 222;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return -1, if doesn't exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // it'll not exceed integer value now

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
