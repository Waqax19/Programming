package Recursion;

public class FibonacciIteration
{
    static int fib(int n)
    {
        int fib = 1;
        int pre = 1;

        if (n == 0)
            return 0;

        if(n == 1  || n == 2)
        {
            return 1;
        }

        for (int i = 0; i < n ; i++)
        {
            int temp = fib;
            fib += pre;
            pre = temp;
        }

        return fib;
    }

    public static void main(String[] args)
    {
        int number = 50;

        long startTime = System.nanoTime();

        long endTime = System.nanoTime();

        System.out.println("Fib of " + number + " is " + fib(number));


        System.out.println("The code took " + (startTime - endTime) + " ns");

    }
}
