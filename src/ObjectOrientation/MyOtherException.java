package ObjectOrientation;

public class MyOtherException extends Exception
{
    public static void main(String[] args)
    {
        try
        {
            throw new MyOtherException();
        }
        catch (MyOtherException e)
        {
            System.out.println("Caught the exception");
            e.getStackTrace();

        }
    }
}
