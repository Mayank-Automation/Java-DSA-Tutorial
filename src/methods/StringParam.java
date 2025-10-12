package methods;

public class StringParam {

    static void main() {

        String greetMessage = greet("Kaushal");
        System.out.println(greetMessage);
    }

    static String greet(String name)
    {
        String message = "Hello "+name;
        return message;
    }
}
