package Threads;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TimedSemaphores
{
    private TimedSemaphores semaphores;

    TimedSemaphores(long period, TimeUnit seconds, int slotLimit)
    {
        semaphores = new TimedSemaphores(period, TimeUnit.SECONDS, slotLimit);
    }

    boolean tryAdd()
    {
        return semaphores.tryAdd();

    }

    int availableSlots()
    {
       // return semaphores.getClass();//permits
    }
}
