package SwitchCase;

import java.util.Scanner;

public class NestedSwitchCase {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int empId= scan.nextInt();
        String department = scan.next();

        switch (empId) {
            case 1 -> System.out.println("Mayank Goyal");
            case 2 -> System.out.println("Rahul Khanna");
            case 3 -> {
                System.out.println("Enter the department");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "management" -> System.out.println("management department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("No employee selected");
        }
    }
}
