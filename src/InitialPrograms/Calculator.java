package InitialPrograms;

import java.util.Scanner;

public class Calculator {
    static void main() {
        int ans = 0;
        Scanner scan = new Scanner(System.in);
        // Take input from user till user does not press X or x

        while (true) {
            System.out.println("Enter the operator");
            char op = scan.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input 2 numbers
                System.out.println("Enter 2 numbers");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 %num2;
                }
            }
            else if (op=='x' || op=='X') {
                break;
            } else {
                System.out.println("Invalid operation");
            }
            System.out.println(ans);
        }
    }
}