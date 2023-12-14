package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayinFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = {6, 44, 2, 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 8976;
    }
}
