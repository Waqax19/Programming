package Threads;

public class BoundedSemaphores
{
    private int signal = 0;
    private int bound = 0;

    public BoundedSemaphores(int upperBound)
    {
        this.bound = upperBound;

    }

    public synchronized void take() throws InterruptedException
    {
        while (this.signal == bound)
        {
            wait();
            this.signal++;
            this.notify();
        }
    }

    public synchronized void release() throws InterruptedException
    {
        while (this.signal == 0)
        {
            wait();

            this.signal--;
        }
    }



}
