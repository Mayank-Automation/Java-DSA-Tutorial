package InitialPrograms;

import javax.xml.transform.Source;
import java.util.Scanner;

public class MaxNumber {

    static void main() {

        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();;
        int c = scan.nextInt();

//        int max=a;
//        if(b>max)
//        {
//            max=b;
//        }
//        if (c>max)
//        {
//            max=c;
//        }
//        System.out.println(max);

        // This is optimized way
        int max =Math.max(c, Math.max(a, b));
        System.out.println(max);
   }

}
