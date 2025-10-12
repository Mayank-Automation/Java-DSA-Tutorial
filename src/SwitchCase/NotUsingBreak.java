package SwitchCase;

import java.util.Scanner;

public class NotUsingBreak {

    static void main() {

        Scanner scan = new Scanner(System.in);

        int day = scan.nextInt();

        switch (day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
            default:
                System.out.println("Not a day");
        }

        switch (day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
            default:
                System.out.println("Not a day");
        }
    }
}
