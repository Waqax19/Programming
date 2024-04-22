package Arrayss;

import java.util.Scanner;

public class GradingScores
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int highestScore = 0;

        System.out.println("Enter number of Students : ");
        int i = userInput.nextInt();

        int[] marks = new int[i];

        String[] grade = new String[i];

        System.out.println("Please enter the marks ");

        for (int x = 0; x < i; x++)
        {
            marks[x] = userInput.nextInt();

            highestScore = Math.max(highestScore, marks[x]);
        }

        for (int x = 0; x < i; x++)
        {
            if (marks[x] >= highestScore - 10)
            {
                grade[x] = "A";
            }

            else if (marks[x] >= highestScore - 20)
            {
                grade[x] = "B";
            }

            else if (marks[x] >= highestScore - 30)
            {
                grade[x] = "C";
            }

            else if (marks[x] >= highestScore - 40)
            {
                grade[x] = "D";
            }

            else
                grade[x] = "F";
        }

        for (int x = 0; x < i; x++)
        {
            System.out.println("Student : " + x + " score is : " + marks[x] + " and grade is : " + grade[x]);
        }
    }
}