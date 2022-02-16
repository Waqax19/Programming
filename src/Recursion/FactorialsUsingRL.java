package Recursion;

public class FactorialsUsingRL
{


    static int factorial(int num)
    {
        if (num == 0)

            return 1;


        else
            return num * factorial(num - 1);

    }


    public static void main(String[] args)
    {
        int i;

        int fact = 1;

        int number = 10;
/*
*//*        *//**//*if (number == 0)
            System.out.println(1);

        else
        {
            //for loop
            for (i = 1; i <= number; i++)
            {

                fact *//**//*= fact * i;*//*
            }

        }*/



        fact = factorial(number);

        System.out.println("Factorial of " + number + " is "  + fact);
    }
}
