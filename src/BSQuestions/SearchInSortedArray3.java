package BSQuestions;

// Search in Rotated Sorted Array with duplicate values
public class SearchInSortedArray3 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        System.out.println(findPivotWithDuplicates(arr));
        System.out.println(search(arr, 0));
    }

    // function for pivotBS
    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);
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

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid - 1;
            }

            //if elements at middle, start, and end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: What if these elements at start and end were the pivot?
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            //left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
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
