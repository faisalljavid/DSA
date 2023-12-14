package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[][] arr1 = {
//                {1,2,3,4},
//                {4,5},
//                {6,4,3}
//        };
//        System.out.println(Arrays.toString(arr1[0])); // use this method to print entire row
//        int element = arr1[0][1]; // use this method to print specific element
//        System.out.println(element);




        // ---------------------------------------------------

        int[][] arr = new int[3][2]; // row mentioning is necessity
        // INPUT
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // OUTPUT
        for (int row = 0; row < arr.length; row++) {
                System.out.println(Arrays.toString(arr[row]));
        }

        // enhanced for loop
        for(int[] a : arr) { // here data-type itself is an array that's why 'int[]'
            System.out.println(Arrays.toString(a));
        }

    }
}
