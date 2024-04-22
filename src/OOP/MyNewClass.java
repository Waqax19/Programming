package OOP;

public class MyNewClass
{
    int x;

    public MyNewClass(int x)
    {
        this.x = x;
    }

    public static void main(String[] args)
    {
        MyNewClass myObj = new MyNewClass(25);

        System.out.println("Value of x : " + myObj.x);



    }
}
