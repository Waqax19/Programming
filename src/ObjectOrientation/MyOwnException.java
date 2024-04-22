package ObjectOrientation;

public class MyOwnException extends Exception
{
    public MyOwnException()
    {
        System.out.println("Low on balance..");
    }

    public static void main(String[] args)
    {
        try
        {
            int acc[] = {100, 101, 102, 103 ,104 , 105};

            System.out.println("Account Number \t " + " Balance \t");
            double balance[] = {900 , 2000, 1500, 1560, 1765.78};

            for (int i = 0; i < 5; i++)
            {
                System.out.println(acc[i] + "\t\t" + balance[i] + "\t");

                if(balance[i] < 1000)
                {
                    throw new MyOwnException();
                }
            }
        }
        catch (MyOwnException e)
        {
            System.out.println("We caught the exception");
        }
    }
}
