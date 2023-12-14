package BSQuestions;

// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// this version of code doesn't need to know pivot
public class SearchInSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        int target = 7;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            // left sorted array
            else if (target <= arr[mid]) {
                if (target <= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            // right sorted array
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
