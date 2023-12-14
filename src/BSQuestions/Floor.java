package BSQuestions;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 14, 16, 18};
        int target = 15;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index of greatest no <= target
    static int floor(int[] arr, int target) {
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
        return end;  // only change from BS
    }
}

