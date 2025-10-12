package linearSearch;

public class MinimumNumber {

    static void main() {
        int[] arr= {23,4,56,12,89,45,34,3,-7};
        int min=arr[0];

        for (int i=1; i<arr.length; i++ )
        {
            if(arr[i]< min)
                min=arr[i];
        }
        System.out.println("Minimum value in array is "+ min);
    }
}
