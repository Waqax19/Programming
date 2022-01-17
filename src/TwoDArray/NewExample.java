package TwoDArray;

import java.util.Arrays;

public class NewExample
{
    public static void main(String[] args)
    {
        String[][] name = {
                {"David","Smith"},
                {"John","Paul"},
                {"Ali","Khan"}
        };


        int[][] boardMembers = new int[4][4];

        for (int i = 0; i < boardMembers.length; i++)
        {
            for (int j = 0; j < boardMembers[i].length; j++)
            {
                boardMembers[i][j] = i + j;
            }
        }


        //print the array
        for (int[] a : boardMembers)
        {
            for (int i : a)
            {
                System.out.println(i + "\t");
            }

            System.out.println("\n");
        }


        System.out.println("This is another way of printing 2d Array ");

        System.out.println(Arrays.deepToString(boardMembers));

    }
}
