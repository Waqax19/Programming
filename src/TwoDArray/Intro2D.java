package TwoDArray;

public class Intro2D
{
    public static void main(String[] args)
    {
       // int[][] array = new int[5][5];

        int[][] array = {

                        {1,2},
                        {3,4}

        };

        //array[0][0] = 1;

        for (int[] myNewArray : array)
        {
            for (int data : myNewArray)
            {
                //System.out.println("array[" + i + "][" + j +"] = " + array[i][j]);
                System.out.println("data is : "  + data);
            }
        }


    }
}
