package Functions;

import java.util.Scanner;

public class ReturnFunctionType
{
    public static char printGrade(double score)
    {
        if (score >= 90)
        {
           return 'A';
        }

        else if (score >= 80)
        {
            return 'B';
        }

        else if (score >= 70)
        {
            return 'C';
        }

        else if (score >= 60)
        {
            return 'D';
        }

        else
        {
            return 'F';
        }

    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your score : ");
        int score = userInput.nextInt();

        System.out.println("Your grade is : ");

        System.out.println(printGrade(score));

        /*System.out.println("The grade is : ");
        printGrade(80.5);

        System.out.println("the grade is : ");
        printGrade(95.55);*/

    }
}
