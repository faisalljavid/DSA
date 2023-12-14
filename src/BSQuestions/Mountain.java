package BSQuestions;

// Find peak index in a Mountain Array/Bitonic Array
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Mountain {
    public static void main(String[] args) {

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
}
