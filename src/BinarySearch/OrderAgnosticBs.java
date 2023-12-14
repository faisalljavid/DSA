package BinarySearch;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        int[] arr1 = {98, 43, 32, 10, 5, 0, -1, -33, -999};
        int[] arr2 = {-999, -33, -1, 0, 5, 10, 32, 43, 98};
        int target = 32;
        int ans = orderAgnosticBS(arr1, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) { // common for both
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
