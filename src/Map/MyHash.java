package Map;


import java.util.Map;
import java.util.Scanner;

public class MyHash
{
    public static void main(String[] args)
    {
       int num1 = (int)(Math.random() * 10);

        int num2 = (int)(Math.random() * 10);

        if (num1 < num2)
        {
            int temp = num1;

            num1 = num2;

            num2 = temp;
        }

        System.out.println("What is " + num1 + " - " + num2 + " ?");
        Scanner userInput = new Scanner(System.in);

        int answer = userInput.nextInt();

        if ((num1 - num2) == answer)
        {
            System.out.println("Yes you are correct");
        }
        else
        {
            System.out.println("False");
        }
    }
}