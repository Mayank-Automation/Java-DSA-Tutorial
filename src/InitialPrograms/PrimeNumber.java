package InitialPrograms;

import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num = scan.nextInt();
        System.out.println(isPrime(num)
        );


    }

    static boolean isPrime(int n) {
        int c = 2;
        if (n <= 1) {
            return false;
        }
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}

