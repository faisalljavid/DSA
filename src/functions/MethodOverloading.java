package functions;

public class MethodOverloading {
    public static void main(String[] args) {
        //System.out.println(sum(2,3));
        //System.out.println(sum(4,5,6));

        sum("faisal");

    }

    static int sum(int a, int b)
    {
        System.out.println("first one");
        return a+b;
    }

    static int sum(int a, int b, int c)
    {
        System.out.println("second one");
        return a+b+c;
    }

    static void sum(String name)
    {
        System.out.println("third one");
        System.out.println(name);
    }

}
