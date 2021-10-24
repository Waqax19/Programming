package OOP;

public class Example
{
    int id;

    String name;

    static String company  = "xyz";//static will give us global visibility

    Example(int idOne, String nameOne)
    {
        id = idOne;

        name = nameOne;
    }

    void display()
    {
        System.out.println(id + " " + name + " " + company);
    }

    public static void main(String[] args)
    {
        Example obj1 = new Example(150,"Karen");
        Example obj2 = new Example(240,"Ahmed");

        Example.company = "abc";
        //Example.name
        obj1.display();
        obj2.display();

    }
}
