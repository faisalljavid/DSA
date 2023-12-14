package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfPrimitives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] rollnos = new int[5];
        // int[] rollnos = {23, 34, 56};

        int[] arr = new int[4];
        // TAKING INPUT
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // OUTPUT
        // Method 1
        System.out.println("By First Method");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Method 2
        System.out.println("By Second Method");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Method 3 BEST
        System.out.println("By third method");
        System.out.println(Arrays.toString(arr));

    }
}
