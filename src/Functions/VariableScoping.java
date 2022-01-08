package Functions;

public class VariableScoping
{
    //local variable

    int i;//global variable

    public  void myFunction()
    {
         i = 0;

        i = 110;

        System.out.println(i);
    }


    public  void myOtherFunction()
    {
         i = 55;

        System.out.println(i);
    }



    public static void main(String[] args)
    {



        for (int i = 0; i < 10; i++)
        {
            System.out.println("Okay");
        }

        for (int i = 0; i < 12; i++)
        {
            System.out.println("okay 2");
        }
    }
}
