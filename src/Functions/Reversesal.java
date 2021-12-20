package Functions;

import java.util.Scanner;

public class Reversesal
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Integer Reversal .... ");

        System.out.println("Enter an integer ");

        int number = userInput.nextInt();

        reverseNumber(number);

    }


    public static void reverseNumber(int number)
    {
        while (number > 0)
        {
            System.out.println(number % 10);

            number /= 10;
        }
    }
}
