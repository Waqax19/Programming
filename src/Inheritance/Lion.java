package Inheritance;

public class Lion extends ANimaL
{
    String color = "White";

    Lion()
    {
        super();
    }

    void eat()
    {
        System.out.println("Lion is eating deer ... ");
    }

    void running()
    {
        System.out.println("Lion is running...");
    }

    void printDetails()
    {

       eat();
       running();
    }

    public static void main(String[] args)
    {
        Lion myLion = new Lion();

    }
}