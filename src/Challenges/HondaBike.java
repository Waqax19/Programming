package Challenges;

public class HondaBike extends HeavyBike
{
    @Override
    void run()
    {
        System.out.println("Honda bike is running fast...");
    }

    public static void main(String[] args)
    {
        HeavyBike myBike = new HondaBike();

        myBike.run();


    }
}
