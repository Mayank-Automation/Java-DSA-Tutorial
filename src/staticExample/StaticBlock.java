package staticExample;

// This is a demo to show initialisation of static variables
public class StaticBlock {

    static int a=6;
    static int b;
    int c;
//static block will run only once when first object is created i.e. when class is loaded
    static {
        System.out.println("I am inside static block");
        b= a*5;
       // c=b+2; // Only static variables can be initialised inside static block
    }

    static void main() {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        StaticBlock.b+=5;
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

    }
}
