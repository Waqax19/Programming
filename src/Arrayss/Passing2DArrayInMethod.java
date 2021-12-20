package Arrayss;

public class Passing2DArrayInMethod
{
    static int[][] passing(int[][] myArray)
    {
        int[][] temp = new int[myArray[0].length][myArray.length];

        for (int i = 0; i < myArray[0].length; i++)
        {
            for (int j = 0; j < myArray.length; j++)
            {
                temp[i][j] = myArray[j][i];
            }
        }

        return temp;
    }

    public static void main(String[] args)
    {
        int[][] table = {{5,6,7},{3,4,2}};// 5 6 7 3 4 2
        // 5 3
        // 6 4
        //7 2

        int[][] result;


        System.out.println("Array before exchanging the positions : ");

        for (int i = 0; i < table.length; i++)
        {
            for (int j = 0; j < table.length; j++)
            {
                System.out.println(table[i][j] + " ");
            }
        }

        result = passing(table);

        System.out.println("Array after eachanging the positions ");

        for (int i = 0; i < result[i].length; i++)
        {
            for (int j = 0; j < result[i].length; j++)
            {
                System.out.println(result[i][j] + " ");

                System.out.println();//extra space
            }
        }
    }
}