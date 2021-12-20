package Introduction;

public class Scoping
{
    public static void main(String[] args)
    {
      int [] g  = {1,2,3};

      int[] h = new int[g.length];

        System.arraycopy(g,0,h,0,h.length);

        //test side effect
        //h[0]++;

        System.out.println("Array g : ");

        printArray(g);

        System.out.println("Array h : ");

        printArray(h);

    }

    public static void printArray(int[] a)
    {
        System.out.println("[");

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");

        }
        System.out.println("]");
    }
}
