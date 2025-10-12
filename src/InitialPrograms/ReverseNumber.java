package InitialPrograms;

public class ReverseNumber {

    static void main() {

        int n= 189864;  // outpot should be 46781
        int rev=0;

        while (n>0)
        {
            int rem= n%10;
            rev= (rev*10)+rem;
            n=n/10;
        }
        System.out.println(rev);
    }

}
