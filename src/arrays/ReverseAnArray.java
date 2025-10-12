package arrays;

import java.util.Arrays;

public class ReverseAnArray {
    static void main() {
//Reverse the array with swap start end end
        int[] arr = {1,3,23,89,18,56,43};
        reverse(arr);
        System.out.println(Arrays.toString((arr)));
    }

    static void reverse(int[] arr)
    {
        int start= 0;
        int end= arr.length-1;

        while (start<end)
        {
            swap(arr,start,end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr, int startIndex, int endIndex)
    {

        int temp= arr[startIndex];
        arr[startIndex]= arr[endIndex];
        arr[endIndex]= temp;
    }
}
