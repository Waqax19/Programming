package Recursion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessingScores
{
    public static void main(String[] args) throws Exception
    {

        int numOfScores = (int)(Math.random() * 100 + 100);

        try {
            PrintWriter printWriter = new PrintWriter("testing.txt");

            printWriter.write(randomNumbers(numOfScores));

            printWriter.close();


            System.out.println("Saved " + numOfScores + " scores to the file");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        Scanner userInput = new Scanner(System.in);

        //prompt the user to enter the file

        System.out.println("Enter a file to read the scores .. ");

        File myFile = new File(userInput.nextLine());

        userInput.close();

        ArrayList<Integer> scores = new ArrayList<>();
        int count = 0;

        double total = 0;

        try {
            userInput = new Scanner(myFile);

            while (userInput.hasNextInt())
            {
                total += userInput.nextInt();
                count++;

                scores.add(userInput.nextInt());
            }

            System.out.println("Read " + scores.size() + " scores from " + myFile);

        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        if(!myFile.exists())
        {
            System.out.println("File : " + myFile + " is not there ..");

            System.exit(1);
        }

        System.out.println("File " + myFile.getName());

        System.out.println("Total is : " + total);

        System.out.println("Average is : " + total / count);

    }

    public static String randomNumbers(int size)
    {
        String s = "";

        for (int i = 0; i < size; i++)
        {
            s += " " + (int)(Math.random() * 100);
        }

        return s;
    }
}