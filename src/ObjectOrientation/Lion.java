package ObjectOrientation;

public class Lion extends Animals
{
    String name;

    public Lion(String type , String name)
    {
        super(type);
        this.name = name;

        System.out.println("Lion Constructor with name : " + name);
    }

    public Lion(String name)
    {
        this("Lion", name);

        System.out.println("Overloaded constructor with name : " + name);
    }

    public Lion()
    {
        System.out.println("This is default..");
    }

    public void myFunction()
    {
        System.out.println("This is the function defined in child class..");
    }

    public static void main(String[] args)
    {
        Lion myLion = new Lion("Samba");

        myLion.myFunction();

    }
}
