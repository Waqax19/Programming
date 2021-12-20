package Selections;

import java.util.Scanner;

public class BMI
{
    public static void main(String[] args)
    {
        Scanner usrInput = new Scanner(System.in);

        System.out.println("Enter weight in pounds ");

        double weight = usrInput.nextDouble();

        System.out.println("Enter height in inches ");

        double height = usrInput.nextDouble();

        double kg_p_pound = 0.45359;
        double meters_per_inches = 0.0254;

        double weightinKG = weight * kg_p_pound;

        double heightInMeter = height * meters_per_inches;

        double bmi = weightinKG / (heightInMeter * heightInMeter);

        System.out.println("BMI is " + bmi);

        if(bmi < 18.5)
        {
            System.out.println("Underweight");
        }

        else if(bmi < 25)
        {
            System.out.println("Normal");
        }

        else if(bmi < 30)
        {
            System.out.println("Overweight");
        }

        else
            System.out.println("Obese");



    }
}
