package Abstraction;

import java.util.Scanner;

public class CarValue
{
    private int resourceId;

    public CarValue(int resourceId)
    {
        this.resourceId = resourceId;
    }

    public void cleanUp()
    {
        System.out.println("Cleaning Up resources " + resourceId);
    }

    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Finalizing resources.. " + resourceId);
        cleanUp();
    }

    public static void main(String[] args)
    {
        CarValue resource1 = new CarValue(1);

        CarValue resource2 = new CarValue(2);

        resource1 = null;
        resource2 = null;

        System.gc();
        System.out.println("End of main");
    }
}
