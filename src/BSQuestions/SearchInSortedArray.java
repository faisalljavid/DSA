package BSQuestions;

// Search in Rotated Sorted Array with distinct values
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] arr = {6,7,1,2,3,4,5};
        System.out.println(findPivot(arr));
        System.out.println(search(arr, 4));
    }

    // function for pivotBS
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if you did not find a pivot, it means array is not rotated
        if (pivot == -1) {
            // do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // if pivot is found, we have found 2 ascending sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0] && target < nums[pivot -1]) {
            return binarySearch(nums, target, 0, pivot - 1);
        } else {
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 case over here
            if (mid < end && arr[mid] > arr[mid+1]) {  // for out of range concept
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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
