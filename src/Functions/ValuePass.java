package Functions;

public class ValuePass
{

   /* public static void processData(int data)
    {
        data = data * 10;
    }*/


    public static void increment(int num)
    {
        num++;

        System.out.println("Num inside the method is : " + num);
    }

    public static void main(String[] args)
    {
        int x = 1;

        System.out.println("Before the call, the value of x is : " + x);

        increment(x);

        System.out.println("After the call, the value of x is : " + x);












       /* int myData = 10;

        System.out.println("Data before calling the method is : " + myData);

        //call the function
        processData(myData);

        System.out.println("Data after calling the function is : " + myData);*/
    }
}
