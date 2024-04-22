package Challenges;

public class MyThread1 extends Thread
{

    Table table;

    MyThread1(Table t)
    {
        this.table = t;
    }

    @Override
    public void run() {
        table.printTable(5);
    }
}
