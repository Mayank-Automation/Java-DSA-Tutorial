package arrays;

public class ArrayBasic {

    static void main() {

        int[] rollNo1= new int[5];
        int [] rollNo2 = {2,3,4,5,6,7};
        System.out.println(rollNo2[0]);

        int[] ros; //Decclaration of Array. ros is getting defined in stack
        ros = new int[5]; //object is being created in the memory
        System.out.println(ros[1]);  // by default all the indices has 0 value
    }
}
