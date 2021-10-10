package Arrayss;

import java.util.Scanner;

public class SumTheColumns
{
    public static double sumColumn(double[][] m, int columnIndex)
    {
        double sum = 0;

        for (int row = 0; row < m.length; row++)
        {
            sum += m[row][columnIndex];
        }

        return sum;
    }


    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);
        double[][] my2dArray = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row:");

        for (int i = 0; i < my2dArray.length; i++)
        {
            for (int j = 0; j < my2dArray[0].length; j++)
            {
                my2dArray[i][j] = userInput.nextDouble();
            }
        }

        for (int col = 0; col <= my2dArray.length; col++)
        {
            System.out.println("Sum of the columns are : " + sumColumn(my2dArray, col));
        }

    }
}
