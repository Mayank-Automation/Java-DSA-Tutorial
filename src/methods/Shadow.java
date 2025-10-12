package methods;

public class Shadow {
    // When there is overlap of scope with 2 variable with same name then upper level gets hide
static int x=98;  //This is a class variable
    static void main() {
        int x=40;
        System.out.println(x);  // The 98 is hidden now and 40 shadows that so o/p is 40
        trial();

        System.out.println(x);

    }

    static void trial()
    {
        System.out.println(x);
    }
}
