package Arrayss;

public class LinearSearch
{
    public static void main(String[] args)
    {

        int arry[] = {10,20,30,40,50,60,70,80,90,100,120,200,300,400,500,600,700,800,900,1000,12222,25555,4444,777,888,999,666};

        int key = 666;

        System.out.println(key + " is found at index  " + linear(arry, key));

        long startTime = System.nanoTime();

        long endTime = System.nanoTime();

        System.out.println("The compiler took : " + (startTime - endTime) + " ns");

    }

    public static int linear(int[] array, int key)
    {
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] == key)
            {
                return i;
            }

        }

        return -1;
    }
}
