package linearSearch;

public class LinearSearch {
    static void main() {
        int[] nums ={2,5,67,23,1,87};
        int n=87;
        System.out.println(search(nums,n));

    }

    //Search the array and return index if target item is found
    //if not found return -1
    static int search(int[] arr, int target)
    {
//        for(int i=0; i<arr.length; i++)
        for(int i: arr)

        {
            if(i==target)
                return i;
        }
        return -1;
    }
}
