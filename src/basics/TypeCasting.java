package basics;

import java.sql.SQLOutput;

public class TypeCasting {

    static void main() {

        float number=12;
        System.out.println(number);

        // Type casting
        int num= (int)13.65f;
        System.out.println(num);

        //Automatic type promotion in expression

        int num1=258;
        byte b= (byte)num1;
        System.out.println(b);  // Result will come as number % max value which byte can hold

       //This is also auto casting
        byte a=40;
        byte c=50;
        byte d=100;
        int e = a*c/d;
        System.out.println(e);  // Here 40*50 is auto type casted to int to accumulate


        int num2 = 'A';
        System.out.println(num2);

    }
}