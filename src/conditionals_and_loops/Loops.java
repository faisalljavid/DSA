package conditionals_and_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Print numbers from 1 to n
//        System.out.print("Enter n: ");
//        int n = input.nextInt();

        // for loop
//        for(int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }

        // while loop (same program)
//        int i = 1;
//        while(i <= n) {
//            System.out.print(i + " ");
//            i++;
//        }

        // ----------------------------
        // do while loop
        int number = 1;
        do {
            System.out.print(number + " ");
            number++;
        } while (number <= 5);
    }
}
