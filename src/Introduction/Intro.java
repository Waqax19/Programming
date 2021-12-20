package Introduction;

import java.util.Scanner;

public class Intro
{

    public static void main(String args[])//mandatory part of every java program
    {
       //sentinal control value

        String name;

        int familyCount = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the family member name, or 'end' to stop");

        name = userInput.nextLine();

        while (name.equalsIgnoreCase("end") != true)
        {
            familyCount++;

            System.out.println("keep on entering or 'end' to stop");

            name = userInput.nextLine();
        }

        System.out.println("You have " + familyCount + " members in your family ");
    }
}