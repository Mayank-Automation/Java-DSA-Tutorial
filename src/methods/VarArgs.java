package methods;

import java.util.Arrays;

//VarArgs is variable arguments
public class VarArgs {
    static void main() {
    fun(1,3,67,89,2,3,5,7,8,4,4); //You can pass N number of arguments
        multiple(2,3,"Rohan","Kunal","Jagdish");
    }
    //When you don't know the number of a arguments, then you pass varargs
    static void fun(int ...a)
    {
        System.out.println(Arrays.toString(a));
    }

    static void multiple(int a, int b, String ...v)  //Mix of arguments. The varargs should always come at end
    {
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }
}
