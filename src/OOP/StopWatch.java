package OOP;

import java.util.Arrays;
import java.util.Random;

public class StopWatch
{
    /*
    ■ Private data fields startTime and endTime with getter methods.
    ■ A no-arg constructor that initializes startTime with the current time.
    ■ A method named start() that resets the startTime to the current time.
    ■ A method named stop() that sets the endTime to the current time.
    ■ A method named getElapsedTime() that returns the elapsed time for the
        stopwatch in milliseconds.
     */

    private long startTime;
    private long endTime;

    StopWatch()
    {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start()
    {
        startTime = System.currentTimeMillis();
    }

    public void stop()
    {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime()
    {
        return endTime - startTime;
    }

    /*
     Write a test
        program that measures the execution time of sorting 100,000 numbers using
        selection sort.
     */

    public void selectionSort(int[] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            int currentMinimumIndex = i;
            int currentMinElement = list[i];


            for (int j = i + 1; j < list.length; j++)
            {
                if (currentMinElement > list[j])
                {
                    currentMinElement = list[j];
                    currentMinimumIndex = j;
                }
            }

            if(currentMinimumIndex != i)
            {
                list[currentMinimumIndex]  = list[i];
                list[i] = currentMinElement;
            }
        }
    }

    public static void main(String[] args)
    {
        StopWatch myWatch = new StopWatch();

        Random random = new Random();

        int[] numbers = new int[1000000000];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = random.nextInt(1000000000);
        }

       // myWatch.selectionSort(numbers);
        Arrays.sort(numbers);
        myWatch.stop();


        System.out.println("Sorting 1000000000 numbers took " + myWatch.getElapsedTime() + " milliseconds..");



    }
}
