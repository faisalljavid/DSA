package LinearSearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {23, 45, 67, -1, 353, 654};
        System.out.print("Enter element to found: ");
        int target = input.nextInt();
        //int ans = LinearSearch(arr, target);
        //System.out.println("Found at index: " + ans);
        int ans2 = LinearSearch2(arr, target);
        System.out.println("Element is: " + ans2);
        //boolean ans3 = LinearSearch3(arr, target);
        //System.out.println("True or false: " + ans3);
    }

    // return the index if item is found
    // otherwise return -1
    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for-loop
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }


    // return the element itself
    static int LinearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        // run a for-loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

    // return true or false
    static boolean LinearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // run a for-loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }
}
