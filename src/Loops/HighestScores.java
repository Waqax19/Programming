package Loops;

import java.util.Scanner;

public class HighestScores
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int highestScore = 0;//student with highest score

        String nameOfHighestScoreStudent = "";

        System.out.println("Please enter the number of students ");

        int numberOfStudents = userInput.nextInt();

        System.out.println("Please enter each student name and scores : ");

        for (int i = 0; i < numberOfStudents; i++)
        {
            System.out.println("Student " + (i + 1) + " Name ");

            String studentName = userInput.next();

            System.out.println("Score ");

            int score = userInput.nextInt();


            if (score > highestScore)
            {
                highestScore = score;

                nameOfHighestScoreStudent = studentName;
            }

        }

        System.out.println("Student with highest score name is : " + nameOfHighestScoreStudent + " and he scored " + highestScore);



    }
}
