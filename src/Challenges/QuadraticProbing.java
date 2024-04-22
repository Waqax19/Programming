package Challenges;

public class QuadraticProbing
{

    //a function to implement quadratic probing
    public static void quadraticProbing(int table[] , int sizeN, int arr[], int N)
    {
        for (int i = 0; i < N; i++)
        {
            int hashValue = arr[i] % sizeN;

            if (table[hashValue] == -1)
            {
                table[hashValue] = arr[i];
            }

            else
            {
                for (int j = 0; j < sizeN; j++)
                {
                    int t = (hashValue + j * j ) % sizeN;

                    if (table[t] == -1)
                    {
                        table[t] = arr[i];
                        break;
                    }

                }
            }
        }

        printArray(table);
    }


    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }
    }


    public static void main(String[] args)
    {
        int arr[] = {50,700,76,85,92,73,101};


        int N = 7;

        int sizeHash = 7;


        int hash_table[] = new int[sizeHash];

        for (int i = 0 ; i < sizeHash; i++)
        {
            hash_table[i] = -1;
        }


        quadraticProbing(hash_table, sizeHash, arr, N);

    }
}
