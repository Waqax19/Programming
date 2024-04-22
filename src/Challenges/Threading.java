package Challenges;

public class Threading extends Thread
{
    public void run()//running
    {
        for (int i = 0; i < 3 ; i++)
        {
            System.out.println(Thread.currentThread().getName() + " in control ");

        }
    }


    public static void main(String[] args)
    {
        Threading threading = new Threading();

        Threading threading1 = new Threading();

        threading.start();


        threading1.start();

        for (int i = 0; i < 3 ; i++)
        {
            threading.yield();

            System.out.println(Thread.currentThread().getName() + "  in control ");
        }

    }
}
