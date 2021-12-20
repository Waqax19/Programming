package Threads;

public class PrintingStuff
{
    //Binary Queue
    private boolean locked = false;

    PrintingStuff(int initial)
    {
        locked = (initial == 0);

    }

    public synchronized void waitForNotify() throws InterruptedException
    {
        while (locked)
        {
            wait();
        }

        locked = true;
    }

    public synchronized void notifyWake()
    {
        if(locked)
            notify();

        locked = false;
    }
}
