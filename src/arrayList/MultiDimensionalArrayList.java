package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    static void main() {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        // Initialize the arraylist
        for (int i=0; i<3; i++)
        {
            list.add(new ArrayList<>());
        }
        //add elements
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
               list.get(i).add(scan.nextInt());

            }
        }
        System.out.println(list);
    }
}
