package TwoDArray;

public class SodukoCode
{
    public static boolean isValid(int[][] puzzle, int row, int col, int number)
    {
        //all row elements must be unique
        for (int d = 0; d < puzzle.length; d++)
        {
            if (puzzle[row][d] == number)
            {
                return false;
            }
        }

        for (int r = 0; r < puzzle.length; r++)
        {
            if (puzzle[r][col] == number)
            {
                return false;
            }
        }
        //all other corresponding squares has unique number
        int nearest_squares = (int) Math.sqrt(puzzle.length);

        int blockRow = row - row % nearest_squares;
        int blockCol = col - col % nearest_squares;

        for (int r = blockRow; r < blockRow + nearest_squares; r++)
        {
            for (int d = blockCol; d < blockCol + nearest_squares; d++)
            {
                if (puzzle[r][d] == number)
                    return false;
            }
        }

        //if there is no clash, then it is unique
        return true;
    }


    public static boolean solution(int[][] puzzle, int n)
    {
        int row = -1;

        int col = -1;

        boolean isEmpty = true;


        for (int i = 0; i < n; i++)
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
            return true;

        for (int num = 1; num <= n; num++)
        {
            if (isValid(puzzle, row, col, num))
            {
                puzzle[row][col] = num;
                if(solution(puzzle, n))
                {
                    return true;
                }
                else
                {
                    puzzle[row][col] = 0;
                }
            }
        }

        return false;
    }



    public static void printSoduko(int[][] puzzle, int N)
    {
        for (int r = 0; r < N; r++)
        {
            for (int d = 0; d < N; d++)
            {
                System.out.println(puzzle[r][d]);
                System.out.println(" ");
            }
            System.out.println("\n");

            if((r + 1) % (int)Math.sqrt(N) == 0)
            {
                System.out.println("");
            }
        }
    }


    public static void main(String[] args)
    {
        int[][] puzzle = new int[][]
                {
                        {0,0,7,9,0,0,8,0,0},
                        {0,0,0,0,0,4,0,0,1},
                        {0,5,0,0,2,0,0,0,6},
                        {0,3,0,5,4,0,0,9,0},
                        {0,2,0,7,6,3,0,4,0},
                        {0,8,0,1,9,0,0,3,0},
                        {4,0,0,0,3,0,0,8,0},
                        {6,0,0,2,0,0,0,0,0},
                        {0,0,8,4,0,9,2,0,0}

                };



        int N = puzzle.length;

        System.out.println("Before solving : ");
        printSoduko(puzzle, N);

        System.out.println("");

        System.out.println("After solving ");
        if (solution(puzzle , N))
        {
            printSoduko(puzzle, N);
        }
        else
            System.out.println("No solution exists");
    }
}
