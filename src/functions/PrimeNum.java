package functions;

import java.util.Scanner;


// PRIME NUMBER CHECK
public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
        //since the loop would exit only if no factors are found, indicating that the number is prime.
    }
}
