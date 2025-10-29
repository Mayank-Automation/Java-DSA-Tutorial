package staticExample;

public class Main {

    static void main() {
      // Static variables are independent of object
        Human mayank = new Human(33, "Mayank", 10000, true);
        Human rahul = new Human(24, "Rahul", 12000, false);
        System.out.println(mayank.age);
        System.out.println(rahul.name);
        System.out.println(Human.population);   // right way of accessing static variable with class name
        System.out.println(mayank.population);  // it will work but not a good practice
        System.out.println(rahul.population);
    }

    static void fun()
    {
        //  greeting(); //you can't call a non static member inside static one
        Main obj = new Main();
        obj.greeting(); // It can be done with object
    }

    void fun2()
    {
        greeting();  //you can call it under non static directly
    }

    void greeting()
    {
        fun(); //you can call a static member inside non static
        System.out.println("This is non static method");
    }
}

// this keyword can't be used insode static method.
//this represents an object
