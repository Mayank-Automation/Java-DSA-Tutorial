package searchInMatrices;

public class RowColMatrix {
// Search in a 2D array when row and columns are sorted
    static void main() {
        int[][] a = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(search2DArray(a, 80));

    }

     static boolean search2DArray(int[][] arr, int target) {
       int start = 0;
       int end= arr.length-1;
       boolean found=false;

       while (start<arr.length && end>=0)
       {
           if (target==arr[start][end])
           {
               found=true;
               break;
           }
          if(target<arr[start][end])
          {
              end--;
          } else if (target>arr[start][end]) {
              start++;
          }
       }

         return found;
     }


}
