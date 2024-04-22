package ObjectOrientation;

public class StaticBinding
{
    public static class superClass
    {
         static void print()
        {
            System.out.println("Hello..");
        }
    }

    public static class  subclass extends superClass
    {
        static void print()
        {
            System.out.println("Hi..");
        }
    }

    public static void main(String[] args)
    {
        superClass A = new superClass();
        superClass B = new subclass();

        A.print();
        B.print();
    }
}
