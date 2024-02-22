package StringAndStringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a = "Faisal";
        String b = "Faisal";
        String c  = a;

        // ==
        System.out.println(a==b);

        String name1 = new String("Faisal");
        String name2 = new String("Faisal");
        System.out.println(name2==name1);

        // .equals()
        System.out.println(name1.equals(name2));
    }
}
