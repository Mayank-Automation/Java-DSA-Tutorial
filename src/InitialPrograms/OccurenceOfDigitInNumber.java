package InitialPrograms;

public class OccurenceOfDigitInNumber {

    static void main() {
        // Find the frequency of number 7 in given integer
        int n=73777578;
        int count =0;

        while (n>0)
        {
            int r= n%10;

            if(r==7)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
