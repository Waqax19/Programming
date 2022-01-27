package Inheritance;

public class Car2 extends Vehicle
{
    void running()
    {
        System.out.println("Vehicle is running safely ...");
    }

    public static void main(String[] args)
    {
        Car2 myCar = new Car2();

        myCar.running();
    }


}
