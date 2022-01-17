package TwoDArray;

public class SumRowsAndColumn
{
    public static void main(String[] args)
    {
        int rows, column, sumRows, sumCols;

        int a[][] = {
                {1,2,3},//6
                {4,5,6},//15
                {7,8,9}//24
                //12 15 18
        };


        rows = a.length;
        column = a[0].length;

        //calculate each row sum
        for (int i = 0; i < rows; i++)
        {
            sumRows = 0;

            for (int j = 0; j < column; j++)
            {
                sumRows = sumRows + a[i][j];
            }

            System.out.println("Sum of " + (i + 1) + " row " + sumRows);
        }


        for (int i = 0; i < column; i++)
        {
            sumCols = 0;

            for (int j = 0; j < rows; j++)
            {
                sumCols = sumCols + a[j][i];
            }

            System.out.println("Sum of " + (i + 1) + " column " + sumCols);
        }
    }
}
