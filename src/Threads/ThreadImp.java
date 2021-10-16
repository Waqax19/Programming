package Threads;

public class ThreadImp implements Runnable
{
    String name;

    Thread thread;

    ThreadImp(String name)
    {
        this.name = name;

        thread = new Thread(this, name);

        System.out.println("The new thread : " + thread + " has been created\n ");

        thread.start();
    }


    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--)
            {
                System.out.println(name + " ");

                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(name + " thread is interrupted");
        }

        System.out.println(name + " is exiting....");
    }


    public static void main(String[] args)
    {
        new ThreadImp("A");
        new ThreadImp("B");
        new ThreadImp("C");

        try {
            Thread.sleep(8000);


        }
        catch (InterruptedException e)
        {
            System.out.println("Interruption occurs in main thread ");
        }


        System.out.println("We are exiting from main....");

    }
}
