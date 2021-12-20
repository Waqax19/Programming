package Introduction;

import java.util.Scanner;

public class Circle
{
    public static void main(String[] args)
    {
        //to take an input from user...
        int radius;
        double area;

        Scanner userInput = new Scanner(System.in);

        //propmt the message to the user
        System.out.println("Please enter the radius .. ");
        radius = userInput.nextInt();

        final double PI = 3.14159;

        //know the formula
        area = radius * radius * PI;

        //display the result
        System.out.println("Area of circle of radisu " + radius +  " is " + area);

    }
}
