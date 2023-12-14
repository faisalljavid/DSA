package BSQuestions;

// FInd in Mountain Array
// return the minimum index
// https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        // try to search in 2nd half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {
                // you are in decreasing part of array
                // this may be the answer but look at left side
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part to array
                start = mid + 1; // because we know hat mid + 1 element > mid element
            }
        }
        // in the end, start == end, pointing to the largest number because of the two checks above
        // start and end are always trying to find max element in the above two checks
        // hence, when they are pointing to just 1 element, that is the max element, because that is what the checks say
        // more elaboration:
        // at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only 1 item is remaining, hence, because of above line that is the best possible answer

        return start; // or return end, as both are equal
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
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
