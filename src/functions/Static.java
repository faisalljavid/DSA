package functions;

import java.util.Scanner;

public class Static {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String naaam = in.nextLine();

        String personalised = myGreet(naaam);
        System.out.println(personalised);

        // ---------------------------------

        System.out.println(greet());

    }

    static String greet() {
        String greeting = "How are you?";
        return greeting;
    }

    // parameterised
    static String myGreet(String name) {
        return "Hello " + name;

    }
}
