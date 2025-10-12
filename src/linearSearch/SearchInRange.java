package linearSearch;

public class SearchInRange {
    static void main() {
        int[] num= {3,67,23,98,12,57,86};
        System.out.println(linearSearch(num, 1, 4, 86));
    }

    static boolean linearSearch(int[] arr, int start, int end, int target)
    {
        if(arr.length==0)
        {
            return false;
        }
        for (int i=start; i<=end; i++)
        {
            if (arr[i]==target)
                return true;
        }
        return false;
    }

}
