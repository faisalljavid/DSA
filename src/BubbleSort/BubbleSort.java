package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {66, 67, 65, 68, 69};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max element will come at the last respective index
            for (int j = 1; j < arr.length - 1; j++) {
                // swap if the element is smaller than the previous element
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if we did not swap for a particular value of i, it means the array is sorted hence, stop the program
            if (!swapped) break;
        }
    }
}
