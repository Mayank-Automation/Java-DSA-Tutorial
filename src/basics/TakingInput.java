package basics;

import java.util.Scanner;

public class TakingInput {

    static void main() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your roll number");
        System.out.println("Your roll number is "+ scan.nextInt());
        //System.out.println(scan.nextLine());

    }
}
