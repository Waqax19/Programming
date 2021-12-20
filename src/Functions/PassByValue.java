package Functions;

public class PassByValue
{

    public static void main(String[] args)
    {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before calling swap function , num1 is : " + num1 + " and num2 is : "+ num2);

        swap(num1, num2);

        System.out.println("After calling the swap function, num1 is : " + num1 + " and num2 is : "+ num2);

    }
    public static void swap(int num1, int num2)
    {
        System.out.println("Inside the swap method ");
        System.out.println("\nBefore swapping num1 is : " + num1 + " and num2 is : " + num2);

        //swap num1 with num2
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nAfter swapping , num1 is : "+ num1 + " and num2 is : "+ num2);
    }
}