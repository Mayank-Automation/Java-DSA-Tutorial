package linearSearch;

public class SearchIn2DArray {
    static void main() {
        boolean found=false;
        int[][] arr = {
                {23, 12, 56, 67},
                {2, 6, 45, 9, 3},
                {5, 8, 13, 2},
                {1, 5, 9, 4},

        };

        int target = 17;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == target) {
                    System.out.println("Number is there in array");
                    found=true;
                    break;
                }
            }
            if (found)
                break;
        }
        if (!found)
         System.out.println("Number is not there in array");
    }
}
