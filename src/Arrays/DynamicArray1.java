package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(3);
        list.add(54);
        list.add(67);
        list.add(43);
        list.add(78);
        list.add(234);

        System.out.println(list); // printing whole Array

        System.out.println(list.get(1)); // printing specific element

        System.out.println(list.contains(43)); // does it contain?

        list.set(0,99); // set 99 at 0th index
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

    }
}
