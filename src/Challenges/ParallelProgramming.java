package Challenges;

import java.rmi.MarshalException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelProgramming extends RecursiveAction
{

    final int THRESHOLD = 2;

    double[] numbers;

    int startIndex, endIndex;

    ParallelProgramming(double[] numbers, int startIndex, int endIndex)
    {
        this.numbers = numbers;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    protected void compute()
    {
        if ((endIndex - startIndex) > THRESHOLD)
        {
            for (int i = startIndex; i < endIndex; i++)
            {
                numbers[i] = numbers[i] + Math.random();
            }

        }

        else
            invokeAll(new ParallelProgramming(numbers, startIndex, (startIndex - endIndex) / 2),
                    new ParallelProgramming(numbers, (startIndex - endIndex) / 2, endIndex));

    }


    public static void main(String[] args)
    {
        final  int SIZE = 10;
        ForkJoinPool pool = new ForkJoinPool();

        double num[] = new double[SIZE];


        System.out.println("Initialized random values : ");

        for (int i = 0; i < num.length; i++)
        {
            num[i] = i + Math.random();

            System.out.printf("%.5f ", num[i]);

        }

        System.out.println();


        ParallelProgramming parallelProgramming = new ParallelProgramming(num, 0, num.length);


        pool.invoke(parallelProgramming);


        System.out.println("Changed Values : ");

        for (int i = 0; i < 10; i++)
        {
            System.out.printf("%0,4f ", num[i]);

            System.out.println();
        }
    }
}