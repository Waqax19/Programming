package Functions;

public class FunctionsTwo 
{

    /*
    1. What are the return types and parameters for each of the above methods?
2. How would we use printManyTimes to output “Hi” 4 times?
3. How would we use minElement to output the smallest element of an int[] array variable x
     */
    public static void printManyTimes(String message, int n)
    {
        n = 3;
        message = "Hi";
        for (int i = 0; i <= n; i++)
        {
            System.out.println(message);
        }

       // return;
    }

    public static int minElement(int[] list)
    {
        int min = list[0];
        for (int i = 1; i < list.length; i++)
        {
            if (list[i] < min) {
                min = list[i];
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
       // int n = 3;


        int n[] = {20,10,50,40,15,5,25};
        printManyTimes("hi", 4);

        System.out.println(minElement(n));


    }
}
