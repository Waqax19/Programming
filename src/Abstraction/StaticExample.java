package Abstraction;

public class StaticExample
{
    public static int staticVariable = 0;

    public static final double PI = 3.14159;

    private int instanceVariable;

    public static void staticMethod()
    {
        System.out.println("Static method called.");

        //System.out.println("Instance variable : " + instanceVariable);
    }

    public StaticExample(int instanceVariable)
    {
        this.instanceVariable = instanceVariable;
    }

    public void instanceFunction()
    {
        System.out.println("Instance method called with instanceVariable : " + instanceVariable);
    }

    public static void main(String[] args)
    {
        System.out.println("Value of the static variable before the object creation is : " + staticVariable);

        staticMethod();

        StaticExample myObj = new StaticExample(20);

        myObj.instanceFunction();

        //PI = 50;

        System.out.println("Value of PI is : " + PI);


    }


}
