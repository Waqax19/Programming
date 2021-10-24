package Threads;

public class PrintThread
{
    public void printThread()
    {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Counter .... " + i);
            }
        }catch (Exception e)
        {
            System.out.println("Thread Interrupted");


        }
    }
}
