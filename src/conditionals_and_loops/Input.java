package conditionals_and_loops;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rollno: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is " + rollno);
    }
}
