package CycleSortQuestions;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/description/
// Finding all numbers not listed from 0 to N
public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]; // or remove this line
            if (arr[i] < arr.length && arr[i] != arr[correct]) { // or arr[i] != arr[arr[i]]
                swap (arr, i, correct); // or swap(arr, i, arr[i])
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
