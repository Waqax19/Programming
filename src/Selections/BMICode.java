package Selections;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class BMICode
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter weight in pounds ");

        double weight = userInput.nextDouble();

        System.out.println("Enter height in inches ");

        double height = userInput.nextDouble();

        double kg_p_pound = 0.453;

        double meters_p_inch = 0.0254;


        double weightInKG = weight * kg_p_pound;

        double heightInMeters = height * meters_p_inch;

        double bmi = weightInKG / (heightInMeters * heightInMeters);

        System.out.println("BMI is : " + bmi);


        if(bmi < 18.5)
            System.out.println("Underweight ");

        else if(bmi < 25)
        {
            System.out.println("Normal");
        }

        else if(bmi < 30)
            System.out.println("Overweight");

        else
            System.out.println("Obese");
    }
}
