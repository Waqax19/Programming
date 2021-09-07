import java.util.Scanner;

public class DoWhileLoop
{
    public static void main(String[] args)
    {
        int data;

        int sum = 0;

        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("Enter an integer (the input ends if it is 0)");

            data = userInput.nextInt();

            sum += data;

        }while (data != 0);

        System.out.println("The sum is : " + sum);

    }
}
