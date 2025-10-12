package methods;

import java.util.Arrays;

public class ChangeValueWithParameters {
    static void main() {

        int[] arr={1,4,7,2,9};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void change (int[] num)
    {
        num[0]=99;  //This will change as change is being done to the object via this ref variable, same object will be changed
    }
}
