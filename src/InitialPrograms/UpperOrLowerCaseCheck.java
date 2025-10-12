package InitialPrograms;

import java.util.Scanner;

public class UpperOrLowerCaseCheck {

    static void main() {

        Scanner scan = new Scanner(System.in);
        char ch= scan.next().trim().charAt(0);
        if(ch>= 'a'  && ch<='z')
{
    System.out.println("it is small letter");
}else{
            System.out.println("This is upper case letter");
}
}
}