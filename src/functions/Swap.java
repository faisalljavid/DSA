package functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a = b;
//        b = temp;

        swap(a,b);
        System.out.println(a + " " + b);
    }

    // In JAVA, there is only pass by value
    // here by using this method we can't actually swap the original numbers
    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
