package Inheritance;

public class subclass extends NewClass
{

    subclass()
    {
        System.out.println();
    }
    public void print()
    {
        System.out.println("Print method of subclass...");
    }
    public static void main(String[] args)
    {
        NewClass A = new NewClass();

        NewClass B = new subclass();

        A.print();
        B.print();

    }
}
