package methods;

public class Overloading {
    static void main() {
fun(56);
fun("Rahul");

    }

    static void fun(int a)
    {
        System.out.println(a);
    }

    static void fun(String  name)
    {
        System.out.println(name);
    }

    static void fun(int b, String  address)
    {
        System.out.println(b+ address);
    }
    static void fun(String  address, int b)
    {
        System.out.println(b+ address);
    }

}
