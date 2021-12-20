package Arrayss;

public class ReturnArray
{
    public static int[] getArray()
    {
        int[] arr = {17,18,19,20,21};

        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = getArray();

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
