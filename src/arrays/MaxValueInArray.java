package arrays;

public class MaxValueInArray {
    static void main() {

        int[] arr = {1,3,23,89,18,56};
        System.out.println(max(arr));
    }

    static int max(int[] arr)
    {
        int maxval=arr[0];
        for (int j : arr) {
            if (j > maxval) {
                maxval = j;
            }
        }
        return maxval;
    }
}
