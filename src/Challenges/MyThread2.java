package Challenges;

public class MyThread2 extends Thread
{
    Table t;

    MyThread2(Table t)
    {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(1000);
    }


    public static void main(String[] args)
    {
        Table myObj = new Table();

        MyThread1 thread1 = new MyThread1(myObj);

        MyThread2 thread2 = new MyThread2(myObj);

        thread1.start();
        thread2.start();

    }
}
