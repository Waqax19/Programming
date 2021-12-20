package Functions;

public class OverloadingFunctions
{
    public static void sum(int a, int b)
    {
        System.out.println("Sum of a and b is : " + (a + b));
    }

    public static void sum(int a, int b, int c)
    {
        System.out.println("Sum of a b c is : " + (a + b + c));
    }

    public static void sum(float a , int b)
    {
        System.out.println("Sum of float a and int b is : "+ (a + b));
    }

    public static void main(String[] args)
    {
        sum(5,5);

        sum(5,10,15);

        sum(5.55f,5);

    }
}
