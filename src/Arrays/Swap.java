package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,66,23};
        System.out.println(Arrays.toString(arr));
        // swapping first and last element
        swap(arr, 0, arr.length-1);
        System.out.print("After Swapping: ");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
