package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValueRetrieval {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0]=43;
//        arr[1]=54;
//        arr[2]=67;
//        arr[3]=98;
//        arr[4]=47;

        for (int i=0; i<arr.length; i++)
        {
            arr[i]= scan.nextInt();  // To enter in run time
        }

       for(int j : arr) // For every element in array, print the element
       {
           System.out.println(j);  // here j represents the element of array
       }

        System.out.println(Arrays.toString(arr));  // You can use this to print without loop

    }
}
