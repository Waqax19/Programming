package Misclenious;

public class Subclass extends SuperClass
{
    int num = 50;

    Subclass()
    {
        super();
    }

    public void display()
    {
        System.out.println("The is the display function of child class.");
    }

    public void myMethod()
    {
        Subclass myObj = new Subclass();

        myObj.display();
        super.display();

    }

    public static void main(String[] args)
    {
        Subclass myObj = new Subclass();

        myObj.myMethod();

    }

}
