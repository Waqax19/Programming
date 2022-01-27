package Inheritance;

public class MountainBike extends Bike
{
    void run()
    {
        System.out.println("running safely at 120km/h");
    }


    public static void main(String[] args)
    {
        Bike myBike = new MountainBike();

        myBike.run();

    }
}
