package Loops;

import java.util.Scanner;

public class GreatestDC
{


    public static int addition(int num1, int num2)
    {
        return num1 + num2;
    }

    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter first num ");
        int num1 = userInput.nextInt();

        System.out.println("Enter second number ");
        int num2 = userInput.nextInt();


        int newRes = addition(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 +" is : " + newRes);

        //int result = addition(10,50);

        //System.out.println(result);

        //System.out.println(addition(10,15));

    }
}