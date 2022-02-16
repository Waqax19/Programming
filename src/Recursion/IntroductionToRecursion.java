package Recursion;

public class IntroductionToRecursion
{

    static int count = 0;

    static void myFunction()
    {

        count++;
        if (count <= 5)
        {
            System.out.println("hello there " + count);
            myFunction();
        }


    }

    public static void main(String[] args)
    {
        myFunction();

    }
}
