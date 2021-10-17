package Arrayss;

import javax.swing.plaf.RootPaneUI;

public class SodukoSolution
{
    //declare a 9 * 9 array.
    //enter the values for the soduko , 0 for empty
    //print the result before actually solving
    //write function of type boolean



    public static boolean isValid(int[][] puzzle, int row, int col, int num)
    {
        //each row must have a unique number
        for (int r = 0; r < puzzle.length; r++)
        {
            //if the number we are trying to place is already there ....

            if (puzzle[row][r] == num)
            {
                return false;
            }
        }
        //each col must have unique num
        for (int c = 0; c < puzzle.length; c++)
        {
            //number we are trying to place in col, is already there ...
            if (puzzle[c][col] == num)
            {
                return false;
            }
        }

        //corresponding squares has unique number
        int sqrt = (int) Math.sqrt(puzzle.length);

        int bRow  = row - row % sqrt;

        int bCol = col - col % sqrt;

        for (int r = bRow; r < bRow + sqrt; r++)
        {
            for (int d = bCol; d < bCol + sqrt; d++)
            {
                if(puzzle[r][d] == num)
                {
                    return false;
                }
            }
        }
        //if there is no clash in the numebrs
        return true;
    }

    public static boolean solution(int[][] puzzle, int n)
    {
        int row = -1;

        int col = -1;

        boolean isEmpty = true;

        for (int i = 0; i < n ; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(puzzle[i][j] == 0)
                {
                    row = i;

                    col = j;

                    isEmpty = false;

                    break;
                }
            }
            if(!isEmpty)
                break;
        }
        if (isEmpty)
        {
            return true;

        }
            //back-track for each row

        for (int number = 1; number <= n; number++)
        {
            if(isValid(puzzle, row, col, number))
            {
                puzzle[row][col] = number;

                if (solution(puzzle, n))
                {
                    printSod(puzzle,n);
                    return true;
                }
            }

            else
                puzzle[row][col] = 0;//replace it

        }

        return false;
    }


    //print the soduko
    public static void printSod(int[][] puzzle, int n)
    {
        for (int r = 0; r < n ; r++)
        {
            for (int c = 0; c < n; c++)
            {
                System.out.println(puzzle[r][c]);

                System.out.println(" ");
            }


            System.out.println("\n");


        }
    }

    public static void main(String[] args)
    {
        int[][] puzzle = new int[][]
                {
                        { 3, 0, 5, 4, 0, 2, 0, 6, 0 },
                        { 4, 9, 0, 7, 6, 0, 1, 0, 8 },
                        { 6, 0, 0, 1, 0, 3, 2, 4, 5 },
                        { 0, 0, 3, 9, 0, 0, 5, 8, 0 },
                        { 9, 6, 0, 0, 5, 8, 7, 0, 3 },
                        { 0, 8, 1, 3, 0, 4, 0, 9, 2 },
                        { 0, 5, 0, 6, 0, 1, 4, 0, 0 },
                        { 2, 0, 0, 5, 4, 9, 0, 7, 0 },
                        { 1, 4, 9, 0, 0, 7, 3, 0, 6 }
                };

        int num = puzzle.length;

        System.out.println("Before getting the solution...");

        printSod(puzzle, num);

        System.out.println("After solution...");

        if (solution(puzzle, num))
        {
            printSod(puzzle,num);
        }

        else
            System.out.println("Solution does not exists...");











    }




}
