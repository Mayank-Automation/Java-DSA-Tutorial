package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    static void main() {

        // int[][] arr = new int[3][];  // number of columns is not mandatory

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {6, 7, 8, 9}
//        };
//
        // Input
        int[][] arr = new int[3][3];  // 3 rows and any number of column
        Scanner scan = new Scanner(System.in);

        for (int i=0; i< arr.length; i++ )
        {
            for (int j=0; j<arr[i].length; j++)
            {
                arr[i][j]= scan.nextInt();
            }
        }

        // Output

        for (int i=0; i< arr.length; i++ )
        {
            for (int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // You can write this way as well for optimization
        for (int[] value : arr) {
            System.out.println(Arrays.toString(value));  // optimized way
        }

        // Using enhanced for loop

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


    }
}
