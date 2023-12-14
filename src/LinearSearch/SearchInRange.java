package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(LinearSearch(arr, target, 1, 4));
    }

    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for-loop
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
