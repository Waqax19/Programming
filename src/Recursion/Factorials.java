package Recursion;

import OOP.Calculation;
import OOP.Counting;

public class Factorials extends Calculation
{
    public static void main(String[] args)
    {
        System.out.println("Factorial of 5 is : " + factorial(5));

        Factorials myObj = new Factorials();

        System.out.println(myObj.formatting);

    }

    static int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }

        else
            return (n * factorial(n - 1));
    }

}
