package OOP;

import java.util.Date;

public class AccontBank
{
    private int id;

    private double balance;

    private static double annualInterestRate;

    private Date dateCreated;


    AccontBank()
    {
        id = 0;
        balance = 0;

        annualInterestRate = 0;
        dateCreated = new Date();


    }

    //create account with specified id and initial balance

    AccontBank(int newId, double newBalance)
    {
        id  = newId;

        balance = newBalance;

        dateCreated = new Date();

    }


    public int getId() {
        return id;
    }

    public void setId(int newId)
    {
        id = newId;
    }



    public void setBalance(double newBalace)
    {
        balance = newBalace;
    }


    public void setAnnualInterestRate(double newAnnualInterestRate)
    {
        annualInterestRate = newAnnualInterestRate;
    }


    public Date getDateCreated() {
        return dateCreated;
    }


    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }



    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest()
    {
        return balance * (getMonthlyInterestRate() / 100);
    }


    //withdraw

    public void withDraw(double amount)
    {
        balance -= amount;
    }


    public void deposit(double amount)
    {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args)
    {
        AccontBank bank = new AccontBank(1122,20000);

        bank.setAnnualInterestRate(4.5);


        bank.withDraw(2500);

        bank.deposit(3000);

        //display the results

        System.out.println("        Account Details     ");


        System.out.println("Account Id : " + bank.getId());

        System.out.println("Date Created : " + bank.getDateCreated());

        System.out.println("Balance : $2.5\n" + bank.getBalance());

        System.out.println("Monthly Interest : " + bank.getMonthlyInterest());


    }

}
