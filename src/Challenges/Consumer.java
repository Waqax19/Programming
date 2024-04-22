package Challenges;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable
{
    private BlockingQueue<Messages> queue;

    public Consumer(BlockingQueue<Messages> queue)
    {
        this.queue = queue;
    }

    @Override
    public void run()
    {
        try {

            Messages messages;

            while ((messages = queue.take()).getMessage() != "Exit")
            {
                Thread.sleep(10);

                System.out.println("Consumed " + messages.getMessage());
            }
        }

        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }


    public static void main(String[] args)
    {
        BlockingQueue<Messages> queue = new ArrayBlockingQueue<>(10);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();

        new Thread(consumer).start();

        System.out.println("Producer and Consumer has been started !! ");

    }
}
