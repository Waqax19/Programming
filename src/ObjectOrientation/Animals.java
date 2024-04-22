package ObjectOrientation;

public class Animals
{
    String type;

    public Animals(){}
    public Animals(String type)
    {
        this.type = type;

        System.out.println("This is the animal constructor : " + type);
    }


    public  void myFunction()
    {
        System.out.println("This is the function of parent class..");
    }


    public void myFunction(int i)
    {
        System.out.println("This is overloading..");
    }
}
