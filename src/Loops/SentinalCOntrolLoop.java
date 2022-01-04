package Loops;

import java.util.Scanner;

public class SentinalCOntrolLoop
{
    public static void main(String[] args)
    {


        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number , (0 for exit )");

        int data = userInput.nextInt();

        int sum = 0;

        while (data != 0)
        {
            sum += data;
            System.out.println("Enter the integer (enter 0 to exit ");

            data = userInput.nextInt();
        }

        System.out.println("The sum is : " + sum);
    }
}
