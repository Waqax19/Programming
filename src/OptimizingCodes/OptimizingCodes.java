package OptimizingCodes;


import java.util.Scanner;

public class OptimizingCodes
{

    int i = 0;
    int x;

    public void myFunction()
    {
        int i = 5;

        i = 10;

        System.out.println(i);
    }

    public  void  anOtherFunction()
    {

        for ( x = 0; x < 10; x++)
        {
            System.out.println("Looping");
        }

        for ( x = 0; x < 10; x++)
        {
            System.out.println("...");
        }

    }

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of points ");

        int numOfPoints = userInput.nextInt();

        double[][] points = new double[numOfPoints][2];

        System.out.println("Enter " + numOfPoints + " points ");
        for (int i = 0; i < points.length; i++)
        {
            points[i][0] = userInput.nextDouble();
            points[i][1] = userInput.nextDouble();
        }


    }
}