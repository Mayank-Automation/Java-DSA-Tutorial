package SwitchCase;
import java.util.Scanner;

public class NewSyntax {

    static void main() {

        Scanner scan = new Scanner(System.in);
        String fruit = scan.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Grapes" -> System.out.println("Small fruit");
            case "Apple" -> System.out.println("Red healthy fruit");
            default -> System.out.println("This is not a fruit");
        }


    }
}
