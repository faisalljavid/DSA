package switch_statements;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        // Old method
////        switch (fruit) {
////            case "Mango":
////                System.out.println("Yellow");
////                break;
////            case "Apple":
////                System.out.println("Red");
////                break;
////            case "Orange":
////                System.out.println("Orange");
////                break;
////            default:
////                System.out.println("Please enter a valid fruit");
////        }
//
//
//        // Enhanced/new method
//        switch (fruit) {
//            case "Mango" -> System.out.println("Yellow");
//            case "Apple" -> System.out.println("Red");
//            case "Orange" -> System.out.println("Orange");
//            default -> System.out.println("Please enter a valid fruit");
//        }


        // ----------------------------------------------------
        // Another method
        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid");
        }
    }
}


