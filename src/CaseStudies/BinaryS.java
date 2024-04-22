package CaseStudies;

public class BinaryS
{
    public static int binarySearch(int[] list, int key)
    {
        int low = 0;

        int high = list.length - 1;

        while (high >= low)
        {
            int middle = (low + high) / 2;

            if (key< list[middle])
            {
                high = middle - 1;
            }

            else if (key == list[middle])
            {
                return middle;
            }

            else
                low = middle + 1;
        }

        return -low - 1;

    }

    public static void main(String[] args)
    {

        int[] list = {2,4,7,9,10,12,15,19,25,32,38,45};

        System.out.println(binarySearch(list, 25));

    }
}
