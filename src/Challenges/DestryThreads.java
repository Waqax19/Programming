package Challenges;

public class DestryThreads extends Thread
{
    DestryThreads(String threadName, ThreadGroup threadGroup)
    {
        super(threadGroup, threadName);

        start();
    }

    public void run()
    {
        for (int i = 0; i < 2; i++)
        {
            try {
                Threading.sleep(5000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }

        System.out.println(Thread.currentThread().getName() + " finished execution");
    }

    public static void main(String[] args) throws InterruptedException
    {
        ThreadGroup threadGroup = new ThreadGroup("Parent Thread ");

        ThreadGroup threadGroup2 = new ThreadGroup(threadGroup, "Child Thread ");

        DestryThreads destryThreads = new DestryThreads("Thread 1 ", threadGroup);

        DestryThreads destryThreads2 = new DestryThreads("Thread 2 ", threadGroup);

        destryThreads.join();
        destryThreads2.join();

        threadGroup2.destroy();

        System.out.println(threadGroup2.getName() + " destroyed");

        threadGroup.destroy();

        System.out.println(threadGroup.getName() + " destroyed ");




    }
}
