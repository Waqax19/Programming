package OptimizingCodes;

import java.util.Scanner;

public class OptimizingCodes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter an index for a Fibonacci number: ");
         int index = input.nextInt();

         // Find and display the Fibonacci number
         System.out.println("The Fibonacci number at index "
             + index + " is " + fib(index));

    }

    public static long fib(long num)
    {

        long f0 = 0;//f(0)
        long f1 = 1;
        long f2 = 2;//f(2)

        if(num == 0)
        {
            return f0;
        }
        else if (num == 1)
        {
            return f1;
        }

        else if (num == 2)
        {
            return f2;
        }

        for (int i = 3; i <= num; i++)
        {
            f0 = f1;

            f1 = f2;

            f2 = f0 + f1;
        }

        return f2;
        /*f (index == 0) // Base case
             return 0;
        else if (index == 1) // Base case
             return 1;
         else // Reduction and recursive calls
         return fib(index - 1) + fib(index - 2);*/
    }
}
