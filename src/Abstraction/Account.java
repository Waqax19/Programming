package Abstraction;

public class Account
{
    private int accountNumber;
    private int accountBalance;

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public void deposit(int a)
    {
        if (a < 0)
        {
            System.out.println("Amount should be more than 0 ");
        } else
        {
            accountBalance = accountBalance + a;
        }
    }
}
