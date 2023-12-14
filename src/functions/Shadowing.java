package functions;


// Shadowing actually begins when the local variable is declared.
public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x;
        // System.out.println(x); error!!  scope will begin when value is initialised
        x = 45;
        System.out.println(x); // 45
        fun(); // 90
    }

    static void fun()
    {
        System.out.println(x);
    }
}
