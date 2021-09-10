package OOP;

import java.util.ArrayList;

public class StaticExample
{
    public int age = 9;


    public final int[] myArray = new int[10];//9 indexed and 10 elements







    final int speedLimit;


    StaticExample(int speedTest)
    {
        speedLimit = speedTest;
    }

    void changeSpeedLimit()
    {
        System.out.println("What is the speedLimit " + speedLimit);
    }

    public void action()
    {
        System.out.println("I am accessing the data ! Obj");

        myArray[0] = 25;
    }

    public static void main(String[] args)
    {


        /*int newAge = age;

        System.out.println(newAge);*/

        StaticExample myObj = new StaticExample(150);

        myObj.action();

        myObj.changeSpeedLimit();

        System.out.println(myObj.age);
        //action();

        ArrayList  myList = new ArrayList();


        myList.add(25);

        myList.add(45);

        myList.add("David");

        System.out.println(myList);
    }


}
