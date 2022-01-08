package Functions;

public class FunctionOverloading
{


    public static int max(int num1, int num2)
    {
        if (num1 > num2)
        {
            return num1;
        }

        else
        {
            return num2;
        }
    }


    public static double max(double num1, double num2)
    {
        if (num1 > num2)
        {
            return num1;
        }

        else
        {
            return num2;
        }
    }

    public static double max(double num1, double num2, double num3)
    {
        return max(max(num1 , num2), num3);
    }

    public static void main(String[] args)
    {
        System.out.println("The max of 5 and 10 is " + max(5,10));

        System.out.println("The max of 10.0 and 20.0 is : " + max(10.0, 20.0));

        System.out.println("The max of 50.0 , 90.0 and 60.0 is : " + max(50,90,60));

    }


























    /*public static void main(String[] args)
    {
        display("Michael", "David");
        display(2,4);

    }

    public static void display(String a , String b)
    {
        System.out.println("Display String " + a +" and " + b);
    }

    public static void display(int a, int b)
    {
        System.out.println("OverLoaded function , a is " + a + " and b is : " + b);
    }
*/

}
