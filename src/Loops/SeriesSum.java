package Loops;

public class SeriesSum
{
    public static void main(String[] args)
    {
        double sum = 0;

        for (double num = 1.0; num <= 97.0; num = num + 2)
        {
            sum += num / (num + 2);
        }

        System.out.println("The sum of the series is : " + sum);

    }
}
