package functions;

import java.util.Arrays;

public class VariableArgs {
    public static void main(String[] args) {
        fun(2,3,45,6,77,88);
        multiple(4, 5, "Faisal", "Kunal", "Apple");
    }



    // used when we give variable number of arguments
    static void fun(int ...v) // v is just a variable
    {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...x)
    {
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.println(Arrays.toString(x));
    }
}
