package ObjectOrientation;

import java.util.Scanner;

public class ChainedException
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the positive integer..");
        int num = userInput.nextInt();

        try
        {
            if (num < 0)
            {
                throw new IllegalArgumentException("Number must be positive");
            }
            
            int result = 100 / num;

            System.out.println("Result : " + result);
        }
        catch (IllegalArgumentException e)
        {
            throw new RuntimeException("Invalid input " , e);
        }
        catch (ArithmeticException e)
        {
            throw new RuntimeException("Divided by zero " , e);
        }
    }
}
