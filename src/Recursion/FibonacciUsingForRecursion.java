package Recursion;

import java.util.Scanner;

public class FibonacciUsingForRecursion
{

    public static long fib(long index)
    {
        if(index == 0)
        {
            return 0;
        }
        else if(index == 1)
            return 1;

        else
            return fib(index - 1) + fib(index - 2);
    }




    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an index for fib number ... ");

        int index = userInput.nextInt();

        System.out.println("The fib number at idnex " + index + " is " + fib(index));

















        /*int num = 10, first = 0 , second = 1;

        System.out.println("Fib series untill " + num + " terms ");

        for (int i = 1; i <= num; i++)
        {
            System.out.println(first + " , ");

            //compute the next
            int nextOne = first + second;

            first = second;

            second = nextOne;
        }*/
    }
}
