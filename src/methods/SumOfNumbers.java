package methods;

import java.util.Scanner;

public class SumOfNumbers {

    static void main() {
        int ans =sum();
        System.out.println("Writing the answer here "+ans);
    }

    static int sum()
    {
        int a,b,c;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the first number");
        a = scan.nextInt();
        System.out.println("Enter the second number");
        b = scan.nextInt();
        c=a+b;
        return c;
    }
}
