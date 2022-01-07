package Functions;

import java.util.Scanner;

public class IntroToFunctions
{
    public static void printGrade(double score)
    {
        if (score >= 90)
        {
            System.out.println('A');
        }

        else if (score >= 80)
        {
            System.out.println('B');
        }

        else if (score >= 70)
        {
            System.out.println('C');
        }

        else if (score >= 60)
        {
            System.out.println('D');
        }

        else
        {
            System.out.println('F');
        }

    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your score : ");
        int score = userInput.nextInt();

        System.out.println("Your grade is : ");
        printGrade(score);

        /*System.out.println("The grade is : ");
        printGrade(80.5);

        System.out.println("the grade is : ");
        printGrade(95.55);*/

    }


}
