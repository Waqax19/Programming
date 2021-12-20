package Functions;

public class FnOverloading
{

    public int y = 50;

    public void  myFunction()
    {
        y = 5555;

    }

    public static void main(String[] args)
    {
        int x = 50;

        for (int i = 0; i < 10; i++)
        {
            System.out.println("what");// i is local variable
            x++;
        }

        for (int i = 0; i < 15; i++)
        {
            System.out.println("ahan");
            x++;
        }
    }
}
