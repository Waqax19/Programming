package Practice;

import java.util.Scanner;

public class Cylinder
{
    /*
    (Compute the volume of a cylinder) Write a program that reads in the radius
    and length of a cylinder and computes the area and volume using the following
        formulas:
        area = radius * radius * pi
        volume = area * length
     */

    public static void main(String[] args)
    {
       // double Pi = 3.14159;

       Scanner in = new Scanner(System.in);


        System.out.println("Enter the radius:");
        int radius = in.nextInt();

        System.out.println("Enter the length of a cylinder ");
        int length = in.nextInt();

        double area = radius * radius * 3.14159;
        System.out.println("The area of the cylinder is : " + area);



        double volume = area * length;

        System.out.println("the volume of the cylinder is : " + volume);


    }
}
