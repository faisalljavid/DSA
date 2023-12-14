package conditionals_and_loops;

// Counting the occurrence of '5'

//public class CountingOccurrence {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = 545425;
//        int count = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 5) {
//                count++;
//            }
//            n = n / 10;
//        }
//        System.out.println(count);
//    }
//
//}



//  Reverse of a number
public class CountingOccurrence {
    public static void main(String[] args) {
        int num = 45632;
        int rev_num = 0;
        while(num > 0) {
            int rem = num % 10;
            num /= 10;
            rev_num = rev_num * 10 + rem;
        }
        System.out.println(rev_num);
    }
}