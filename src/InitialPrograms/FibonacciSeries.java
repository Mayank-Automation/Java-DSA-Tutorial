package InitialPrograms;

public class FibonacciSeries {

    // Program to find the nth fiboacci number
    static void main() {

        int a=0;
        int b=1;
        int n=7;    // We need to create fiboancci series for these numbers
        int count =2;
        System.out.print(a+" "+b);
        while (count<=n)
        {
            int temp =b;
            b= a+b;
            a= temp;
            count++;
            System.out.print(" "+b);
        }

        System.out.println(b);   // to find the nth fibonacci number

    }
}
