package Misclenious;

import java.util.function.LongUnaryOperator;

public class Lion extends Animal
{
    void roar()
    {
        System.out.println("Lion is roaring....");
    }

    void sleep()
    {
        System.out.println("Lion sleeps 20 hours a day ...");
    }


    public static void main(String[] args)
    {
        Lion myObj = new Lion();

        myObj.roar();
        myObj.eat();
        myObj.sleep();

    }
}
