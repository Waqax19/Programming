package OOP;

import java.util.Scanner;

public class AtmDriverClass
{

    public static void main(String[] args)
    {
        AtmClass[] myAccount = new AtmClass[10];

        int atmID;

        double balance;

        for (int i = 0; i < myAccount.length; i++)
        {
            balance = 100;
            atmID = i;

            myAccount[i] = new AtmClass(atmID, balance);


        }

        //TODO :call menu here
        menu(myAccount);

    }

    static void menu(AtmClass arr[])
    {
        int atm_id;

        double withdraw;

        double deposit;

        System.out.println("Please enter relevant ID ");

        Scanner usrInput = new Scanner(System.in);

        atm_id = usrInput.nextInt();

        for (int j = 0; j < arr.length; j++)
        {
            if (atm_id == arr[j].getId() && j < arr.length)
            {
                do
                {
                    System.out.println("Main Menu. ");

                    System.out.println("1 : To check balance");

                    System.out.println("2 : To Wthdraw balance");

                    System.out.println("3 : To Deposit amount ");

                    System.out.println("4 : exit");


                    Scanner userInput = new Scanner(System.in);

                    int userChoice = userInput.nextInt();

                    switch (userChoice)
                    {
                        case 1:
                            System.out.println("Your balance is : " + arr[j].getBalance());
                            break;

                        case 2:
                            System.out.println("Enter the withdraw amount");
                            withdraw = userInput.nextDouble();
                            arr[j].withDraw(withdraw);
                            break;

                        case 3:
                            System.out.println("Enter deposit amount ");
                            deposit = usrInput.nextInt();

                            arr[j].deposit(deposit);
                            break;

                        case 4:
                            System.exit(0);
                    }

                }while (true);
            }

            else if(j == arr.length - 1)
            {
                System.out.println("You have to enter valid ID ");

                System.out.println("Enter your id again .. ");

                atm_id = usrInput.nextInt();

                j = 0;
            }
        }
    }






}
