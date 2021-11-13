package Threads;

public class Semaphores
{
    //count semaphore
    private int signal = 0;

    public synchronized void take()
    {
        this.signal++;
        this.notify();



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
