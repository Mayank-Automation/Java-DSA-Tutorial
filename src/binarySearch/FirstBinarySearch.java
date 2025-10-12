package binarySearch;

public class FirstBinarySearch {
    static void main() {

        int[] arr={2,4,6,7,23,56,78,90,112};
        int start= 0;
        int end= arr.length-1;
        int target=23;
        boolean found=false;
        while (start<=end)
        {
            int middle= (start+end)/2;
            if (arr[middle]==target)
            {
                found=true;
                System.out.println("Number is present");
                break;
            } else if (arr[middle]<target) {
                start=middle+1;

            } else if (arr[middle]>target) {
                end=middle-1;
            }
        }
        if(!found) {
            System.out.println("Number is not present");
        }
    }
}
