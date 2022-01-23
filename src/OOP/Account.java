package OOP;

public class Account
{
    int a;

    int b;

    public void setData(int c, int d)
    {
        a = c;
        b = d;
    }

    public void displayData()
    {
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }

    public static void main(String[] args)
    {
        Account myObj[] = new Account[2];//creates array of two reference variables
        myObj[0] = new Account();//creates objects and assign them to reference variable
        myObj[1] = new Account();

        myObj[0].setData(5,6);
        myObj[1].setData(7,8);

        System.out.println("For array element 0");

        myObj[0].displayData();

        System.out.println("For array eleemtn 1");
        myObj[1].displayData();
    }
}