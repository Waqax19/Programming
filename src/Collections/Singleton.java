package Collections;

public class Singleton 
{
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance()
    {
        return singleton;
    }


    public static void demoOfSingleton()
    {
        System.out.println("Demo of Singleton");
    }
}
