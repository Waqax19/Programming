package Challenges;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPools implements Runnable
{
    private String message;

    public ThreadPools(String s)
    {
        this.message = s;
    }


    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);


        processingTheMessage();

        System.out.println(Thread.currentThread().getName() + " (End)");

    }


    private void processingTheMessage()
    {
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }


    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(50000);

        for (int i = 0; i < 1000; i++)
        {
            Runnable worker = new ThreadPools(" " + i);

            executorService.execute(worker);
        }

        executorService.shutdown();

        while (!executorService.isTerminated())
        {

        }

        System.out.println("Finished all the threads .. ");

    }
}
