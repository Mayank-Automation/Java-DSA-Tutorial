package staticExample;

public class SingletonAccess {
    //Same object will be returned as only one object is allowed
    SingletonClass obj = SingletonClass.getInstance();

    SingletonClass obj1 = SingletonClass.getInstance();

    SingletonClass obj2 = SingletonClass.getInstance();


}
