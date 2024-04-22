package Challenges;

import java.util.Scanner;

public class RecursionProgramming {

    public static int finonacci(long index)
    {
        //base case
        if(index == 0)
        {
            return 0;
        }

        else if(index == 1)
        {
            return 1;
        }

        else
            return finonacci(index - 1) + finonacci(index -2);
    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter an index for the fib number ");
        int index = userInput.nextInt();


        System.out.println("The fibonacci number at index  " + index +  " is  : " + finonacci(index));
    }

}
