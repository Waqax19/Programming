package Challenges;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable
{
    private BlockingQueue<Messages> queue;


    public Producer(BlockingQueue<Messages> q)
    {
        this.queue = q;
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            Messages messages = new Messages("" + i);

            try {
                Thread.sleep(i);
                queue.put(messages);

                System.out.println("Produced " + messages.getMessage());
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }

        Messages messages = new Messages("Exit");
        try {
            queue.put(messages);

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
