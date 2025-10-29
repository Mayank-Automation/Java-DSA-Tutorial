package staticExample;

public class SingletonClass {

    // only one object can be created for singleton class
    //you make the constructor private so that no new objects can be created
    private  SingletonClass()
    {

    }

    private static SingletonClass instance; // this is the only object created

    public static SingletonClass getInstance()
            //Check whether only 1 obj is created or not
    {
        if (instance==null)
        {
            instance= new SingletonClass();
        }
        return instance;
    }

}
