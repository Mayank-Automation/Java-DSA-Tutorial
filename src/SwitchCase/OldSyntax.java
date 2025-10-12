package SwitchCase;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class OldSyntax {

    static void main() {

        Scanner scan = new Scanner(System.in);
        String fruit = scan.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            case "Apple":
                System.out.println("Red healthy fruit");
                break;
            default:
                System.out.println("This is not a fruit");
        }


    }
}
