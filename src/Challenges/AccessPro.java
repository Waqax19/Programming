package Challenges;

import java.util.Scanner;

public class AccessPro
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the subtotal and a gratuity rate..");
        double subTotal = userInput.nextDouble();
        double gratuityRate = userInput.nextDouble();


        double gratuity = subTotal * (gratuityRate / 100);

        double total = subTotal + gratuity;


        System.out.println("The gratuity is : " + gratuity  + " and the total is : " + total);

    }
}
