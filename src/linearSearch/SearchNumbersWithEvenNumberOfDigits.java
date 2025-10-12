package linearSearch;

public class SearchNumbersWithEvenNumberOfDigits {
    // Find that how many numbers in array have even number of digits
    static void main() {
        int[] arr = {12, 345, 2, 6, 7896, 8798, 23, -45,8790};
        System.out.println(evenDigits(arr));
    }

    static int evenDigits(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    //function  to cechk whether the number has even no. of digits
    private static boolean even(int n) {
        if (n<0)
        {
            n=n*-1;
        }
        int count = (int)(Math.log10(n)+1);  // Optimised way
//        while (n > 0) {
//            count++;
//            n = n / 10;
//        }
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }
}

