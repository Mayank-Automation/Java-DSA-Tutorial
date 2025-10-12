package loops;

import java.util.Scanner;

public class ForLoop {

    static void main() {

        // Print numbers from 1 to n
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i=1; i<=num; i+=2)
        {

            System.out.print(i+" ");
        }
    }
}
