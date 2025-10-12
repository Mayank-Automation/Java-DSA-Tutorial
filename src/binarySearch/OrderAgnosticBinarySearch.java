package binarySearch;
//Here the array is sorted but we don't know whether it is in ascending order or descending order
public class OrderAgnosticBinarySearch {
    static void main() {
       // int[] arr={2,4,6,7,23,56,78,90,112};
        int[] arr={112,90,34,22,19,17,15,13,10,9,8,1,-1,-4,-6};
        int start= 0;
        int end= arr.length-1;
        int target=190;
        boolean found=false;
        boolean ascending = arr[start]<arr[end];

        while (start<=end)
        {
            int middle= (start+end)/2;
            if (arr[middle]==target) {
                found = true;
                System.out.println("Number is present");
                break;

            }
            if(ascending)
            {
                if (arr[middle]<target) {
                    start=middle+1;

                } else if (arr[middle]>target) {
                    end=middle-1;
                }
            }else
        {
            if (arr[middle]<target) {
                end=middle-1;

            } else if (arr[middle]>target) {
                start=middle+1;
            }
        }
        }
        if(!found) {
            System.out.println("Number is not present");
        }
    }


    }

