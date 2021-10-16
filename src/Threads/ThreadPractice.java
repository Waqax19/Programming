package Threads;

public class ThreadPractice extends Thread
{
    public void run()
    {
        int x = 50;

        int y = 70;


        int result = x + y;


        System.out.println("Thread has started running ");

        System.out.println("Sum of two number is : " + result);
    }

    public static void main(String[] args)
    {
        ThreadPractice myObj = new ThreadPractice();

        myObj.start();

    }
}
