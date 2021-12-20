package Threads;

public class NewThread implements Runnable
{
    public static void main(String[] args)
    {
        Thread myThread1 = new Thread("HelloA");
        Thread myThread2 = new Thread("HelloB");


        myThread1.start();
        myThread2.start();

        System.out.println("These are the thread names : ");

        System.out.println(myThread1.getName());

        System.out.println(myThread2.getName());


    }

    @Override
    public void run() {

    }
}
