package functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 40;
        String name = "Kunal";
        {
            a = 45;
            System.out.println(a);
            int c = 99;
            System.out.println(c); //but can't be accessed out of this scope

            name = "Faisal";
        }
        System.out.println(a);
        // System.out.println(c);  error!
        int c = 145;
        System.out.println(c); //no error now
        System.out.println(name);
    }
}
