package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //sum();
        int ans = sum2();
        System.out.println("Sum= " + ans);

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number2: ");
        int num2 = in.nextInt();
        return num1 + num2;
    }
}
