package Recursion;

public class Fibonacci
{

    static int fib(int n)
    {
        if (n == 0)
            return 0;

        if(n == 1  || n == 2)
        {
            return 1;
        }

        return fib(n - 2) + fib(n - 1);
    }


    public static void main(String[] args)
    {
        int number = 50;

        System.out.println("Fib of " + number + " is " + fib(number));


        long startTime = System.nanoTime();

        long endTime = System.nanoTime();


        System.out.println("The code took " + (startTime - endTime) + " ns");
    }
}
