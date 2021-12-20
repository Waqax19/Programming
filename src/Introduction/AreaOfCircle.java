package Introduction;

import java.util.Scanner;

public class AreaOfCircle
{

        public static void main(String[] args)
        {

            final double PI = 3.14159;//final is a keyword, indicating it cannot be changed , constants

            Scanner userInput = new Scanner(System.in);
            System.out.println("Please enter the value of the radius ");

            double radius = userInput.nextDouble();
            double area;


            area = radius * radius * PI;
            System.out.println("The area the circle of radius " + radius + " is " + area);

        }
}