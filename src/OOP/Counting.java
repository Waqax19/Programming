package OOP;

public class Counting extends Calculation
{
    static int count = 0;//will get the memory only once and then it will retain it


    Counting()
    {
        count++;//increasing
        System.out.println(count);
    }


    public static void main(String[] args)
    {
        Counting c1 = new Counting();

        Counting c2 = new Counting();

        Counting c3 = new Counting();

        System.out.println(c1.formatting);

    }
}
