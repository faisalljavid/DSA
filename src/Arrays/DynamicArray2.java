package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> listt = new ArrayList<Integer>(5);
        for (int i = 0; i < 5; i++) {
            listt.add(in.nextInt());
        }

        // OUTPUT
        // Ist way
        System.out.println(listt);
        // 2nd Way
        for (int i = 0; i < 5; i++) {
            System.out.println(listt.get(i));
        }
    }
}
