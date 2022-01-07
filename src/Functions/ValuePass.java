package Functions;

public class ValuePass
{

   /* public static void processData(int data)
    {
        data = data * 10;
    }*/


    /*public static void increment(int num)
    {
        num++;

        System.out.println("Num inside the method is : " + num);
    }*/


    public static void swap(int num1, int num2)
    {
        System.out.println("    Inside the swap method ");

        System.out.println("    Before swapping , num1 is " + num1 + " and num2 is : " + num2);

        int temp = num1;

        num1 = num2;

        num2 = temp;

        System.out.println("    After swapping , num1 is : " + num1 + " and num2 is : " + num2);


    }

    public static void main(String[] args)
    {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is : " + num1 + " and num2 is : " + num2);
        swap(num1, num2);
        System.out.println("After invoking the swap method, num1 is : " + num1 + " and num2 is : " + num2);

































        /*int x = 1;

        System.out.println("Before the call, the value of x is : " + x);

        increment(x);

        System.out.println("After the call, the value of x is : " + x);







*/




       /* int myData = 10;

        System.out.println("Data before calling the method is : " + myData);

        //call the function
        processData(myData);

        System.out.println("Data after calling the function is : " + myData);*/
    }
}
