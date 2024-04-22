package OOP;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AtmClass
{
    private int id;

    private double balance;

    private double calAnnualRate;

    private Date dateCreated;

    AtmClass()
    {

    }

    AtmClass(int newId, double newBaln)
    {
        id = newId;
        balance = newBaln;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCalAnnualRate() {
        return calAnnualRate;
    }

    public void setCalAnnualRate(double calAnnualRate) {
        this.calAnnualRate = (calAnnualRate) / 100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String setDateCreated(Date dateCreated)
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd" +
                "HH:mm:ss");


        Date date = new Date();

        return dateFormat.format(date);
    }

    public double getMonthlyInterestRate()
    {
        return calAnnualRate / 12;
    }

    public double getMonthlyInterest()
    {
        return balance * (getMonthlyInterestRate());
    }

    void withDraw(double amount)
    {
        balance -= amount;
    }

    void deposit(double deposit)
    {
        balance += deposit;
    }







}
