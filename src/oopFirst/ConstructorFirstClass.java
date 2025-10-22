package oopFirst;

public class ConstructorFirstClass {
    int rollNo;
    String name;
    float marks;

    ConstructorFirstClass(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(marks);
    }
// Constructor Overloading
    ConstructorFirstClass()
    {
//        this.rollNo=156;
//        this.name="Yaman";
//        this.marks=87.4f;
        this(16, "default person", 100.0f); // This is calling a constructor from
                                                               //another constructor. It calls default one
    }


    ConstructorFirstClass(ConstructorFirstClass other)
    {
        this.rollNo= other.rollNo;
        this.name=other.name;
        this.marks=other.marks;
    }
    static void main(String[] args) {
        ConstructorFirstClass rahul = new ConstructorFirstClass(12, "Rahul", 65.6f);
        ConstructorFirstClass Mohan = new ConstructorFirstClass(14, "Mohan", 98.6f);
        ConstructorFirstClass yaman = new ConstructorFirstClass();
        ConstructorFirstClass random = new ConstructorFirstClass(rahul);
        System.out.println(random.name);
    }
}