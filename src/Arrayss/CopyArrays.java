package Arrayss;

public class CopyArrays
{
    public static void main(String[] args)
    {
        //Sceneario 1

        int[] a = {1,2,3};
        int[] b = a;

        b[0]++;

        System.out.println("Scenario 1");

        System.out.println("Array a : ");
        printArray(a);

        System.out.println("Array b : ");
        printArray(b);


        //Scenario 2

        int[] c = {1,2,3};

        int[] d = new int[c.length];

        for (int i = 0; i < d.length; i++)
        {
            d[i] = c[i];
        }

        d[0]++;

        System.out.println("Scenario 2");

        System.out.println("Array c : ");
        printArray(c);

        System.out.println("Array d : ");
        printArray(d);

        //Scenario 3

        int[] e = {1,2,3};
        int[] f = e.clone();

        f[0]++;

        System.out.println("Scenario 3");

        System.out.println("Array e : ");
        printArray(e);

        System.out.println("Array f : ");
        printArray(f);

        //Scenario 4, arrayCopy Mehtod
        int[] g = {1,2,3};

        int[] h = new int[g.length];

        System.arraycopy(g, 0,h,0,h.length);

        h[0]++;

        System.out.println("Scenario 4 ");
        System.out.println("Array g ");
        printArray(g);

        System.out.println("Array h ");
        printArray(h);
    }


    private static void printArray(int[] a)
    {
        System.out.println("[");

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i] + " ");
        }

        System.out.println("]");
    }
}
