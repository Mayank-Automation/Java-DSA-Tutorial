package SwitchCase;

import java.util.Scanner;

public class NotUsingBreakNewStyle {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();

        switch (day)
        {
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Not a day");
        }
    }
}
