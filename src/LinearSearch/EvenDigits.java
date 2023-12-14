package LinearSearch;
// find no. of numbers that have even no. of digits

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 5324};
        int result = findNumbers(nums);
        System.out.println(result);
        System.out.println(digits2(0));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even no. of digits
    // TWO ways:
    // 1. count the no of digits
    // 2. convert the number into string and get the length
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
        (or)
         */
        return numberOfDigits % 2 == 0;
    }

    // 1st way: count no of digits in a number
    static int digits(int num) {
        if(num < 0) {
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }


    // optimised way
    static int digits2(int num) {
        if(num < 0) {
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }
        return (int)(Math.log10(num)+1);
    }
}
