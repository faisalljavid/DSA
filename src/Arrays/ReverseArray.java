package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3, 5, 4, 21, 55};
        System.out.print("Before Swapping: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("After Swapping: ");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
