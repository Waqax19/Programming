package OOP;

public class BankDriver
{
    public static void main(String[] args)
    {
        AssociationBank associationBank = new AssociationBank("HSBC");

        EmployeeBank emp = new EmployeeBank("David");

        System.out.println(emp.getEmployeeName() + " is an employee of " + associationBank.getBankName());

    }


}
