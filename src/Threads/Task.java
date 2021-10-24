package Threads;

import java.sql.DatabaseMetaData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Runnable
{
    private String str;

    public Task(String s)
    {
        str = s;
    }

    @Override
    public void run()
    {
        try {
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    Date d = new Date();

                    SimpleDateFormat sFormat = new SimpleDateFormat("hh:mm:ss");

                    System.out.println("Starting time for : task " + str + " = " + sFormat.format(d));
                    //it will print starting time of each task
                } else {
                    Date d = new Date();

                    SimpleDateFormat sFormat = new SimpleDateFormat("hh:mm:ss");

                    System.out.println("Execution time for task : " + str + " = " + sFormat.format(d));
                    //it will print completion time of every task
                }

                Thread.sleep(50000000);
            }

            System.out.println(str + " done");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Task task1 = new Task("task 1");
        Task task2 = new Task("task 2");
        Task task3= new Task("task 3");

        ExecutorService myPool = Executors.newFixedThreadPool(3);

        myPool.execute(task1);
        myPool.execute(task2);
        myPool.execute(task3);

        //shutdown the pool
        myPool.shutdown();
    }
}