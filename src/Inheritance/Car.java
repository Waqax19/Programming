package Inheritance;

public class Car extends Vehicle
{

    private String modelName = "Passo";//attribute


    public static void main(String[] args)
    {
        Car myCar = new Car();

        myCar.engine();

        System.out.println("The brand is : " + myCar.brand + " and name is : " + myCar.modelName );
    }
}
