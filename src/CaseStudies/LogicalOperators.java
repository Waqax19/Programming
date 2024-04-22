package CaseStudies;

import java.util.Scanner;

public class LogicalOperators
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an integer ");

        int number = userInput.nextInt();

        if(number % 2 == 0 && number % 3 == 0)
        {
            System.out.println(number + " is divisible by both 2 AND 3");
        }

        if (number % 2 == 0 || number % 3 == 0)
        {
            System.out.println(number + " is divisible by 2 OR 3");
        }

        if(number % 2 == 0 ^ number % 3 == 0)
        {
            System.out.println(number + " is divible by 2 or 3, but not both");
        }

    }
}
