package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class multiDArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        // or
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation is necessary
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<Integer>());
        }
        // INPUT
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        // OUTPUT
        System.out.println(list);

    }
}
