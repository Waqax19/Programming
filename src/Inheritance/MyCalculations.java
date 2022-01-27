package Inheritance;

public class MyCalculations extends Calculations
{
    public void multiplication(int x , int y)
    {
        result = x * y;

        System.out.println("The product of two numbers is : " + result);
    }

    public static void main(String[] args)
    {
        int a = 15, b = 20;

        MyCalculations myCalculations = new MyCalculations();

        myCalculations.addition(a, b);
        myCalculations.substraction(a,b);
        myCalculations.multiplication(a,b);

    }
}
