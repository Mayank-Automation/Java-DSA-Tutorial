package methods;

public class PassingArgumentExample {
    static void main() {
//It won't change
       String name="iron man";
       changeName(name);
        System.out.println(name);

    }

    static String changeName(String naam)
    {
        naam="Captain";   // Creating a new object
        return naam;
    }
}
