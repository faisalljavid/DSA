package BSQuestions;

// https://leetcode.com/problems/split-array-largest-sum/description/
public class SplitArray {
    public static void main(String[] args) {

    }

    static int splitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]); // in the end of the loop this will contain the max item from the array
            end = end + arr[i]; // sum of all values
        }

        // binary search
        while (start < end) {
            // try for the middle as potential answer
            int mid = start + (end - start) / 2;

            // calculate how many pieces you can divide this in with the max sum
            int sum = 0;
            int pieces = 1;
            for(int num : arr) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end; // here start == end
    }
}
