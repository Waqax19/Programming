package Misclenious;

public class MyCalculation extends Calculations
{
    public void multiplication(int x , int y)
    {
        res = x * y;

        System.out.println("The product of given number is : " + res);
    }

    public static void main(String[] args)
    {
        int a = 20, b = 10;

        MyCalculation obj = new MyCalculation();

        obj.addition(a, b);

        obj.subtraction(a,b);

        obj.multiplication(a,b);

    }

}
