package Functions;

import java.util.Scanner;

public class Reversal
{
    public static void reversal(int num)
    {
        while (num > 0)
        {
            System.out.println((num % 10));

            num /= 10;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number ");

        int num = userInput.nextInt();

        reversal(num);

    }
}
