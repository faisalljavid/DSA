package conditionals_and_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input until user doesn't press X or x
        int ans = 0;
        while(true) {
            System.out.print("Enter one of the operators (+ - * /): ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.print("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                    else {
                        System.out.println("Can't divide by zero");
                        break;
                    }
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("Invalid operator!");
                break;
            }
            System.out.println(ans);
        }
    }
}
