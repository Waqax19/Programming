package Threads;

public class ThreadDemo extends Thread
{

    private Thread myThread;
    private String nameOfThread;

    PrintThread PT;

    ThreadDemo(String nameOfThread, PrintThread PT)
    {
        nameOfThread = nameOfThread;
        PT = PT;
    }

    @Override
    public void run() {
        synchronized (PT)
        {
            PT.printThread();
        }

        System.out.println("Thread : "+ nameOfThread + " exiting");
    }



    public  void start() {

        System.out.println("Starting " + nameOfThread);

        if (myThread == null)
        {
            myThread = new Thread(this, nameOfThread);
            myThread.start();
        }
    }


    public static void main(String[] args) {
        PrintThread p = new PrintThread();

        ThreadDemo threadDemo = new ThreadDemo("THread - 1 " , p );
        ThreadDemo threadDemo1 = new ThreadDemo("THread - 2 " , p );

        threadDemo.start();

        threadDemo1.start();


        try {
            threadDemo.join();
            threadDemo1.join();
        }
        catch (Exception e)
        {
            System.out.println("Interrupted");
        }

    }
}
