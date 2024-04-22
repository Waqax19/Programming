package ObjectOrientation;

public class Car extends Vehicles
{
    static void method(Vehicles v)
    {
        if(v instanceof Car)
        {
            Car c = (Car) v;

            System.out.println("DownCasting is performed");

        }
    }

    public static void main(String[] args)
    {
        Vehicles v = new Car();
        
        Car.method(v);
    }
}
