package Selections;

import java.util.Scanner;

public class ModulusOperator
{
    public static void main(String[] args)
    {

        Scanner usrInpt = new Scanner(System.in);

        System.out.println("Enter weight in pounds ");
        double weight = usrInpt.nextDouble();

        System.out.println("Enter height in inches ");
        double height = usrInpt.nextDouble();

        //Note that one pound is 0.45359237 kilograms and one inch is 0.0254
        //meters

        final double KG_PER_POUND =  0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKG = weight * KG_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;

        double bmi = weightInKG / (heightInMeters * heightInMeters);

        System.out.println("BMI is : " + bmi);

        if (bmi < 18.5)
        {
            System.out.println("Underweight");
        }

        else if (bmi < 25)
        {
            System.out.println("Normal");
        }

        else if (bmi < 30)
        {
            System.out.println("Overweight");
        }

        else
            System.out.println("Obese");



    }
}