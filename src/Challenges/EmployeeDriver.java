package Challenges;

public class EmployeeDriver
{
    public static void main(String[] args)
    {
        //Employee employee= new Employee();

        Salary salary = new Salary("David", "London",45,85);

        Employee employee = new Salary("James","New York",15,78.45);

        System.out.println("Call the mailCheck using salary reference ");

        salary.mailCheck();

        System.out.println("Call the mailCheck using employee reference ");

        employee.mailCheck();




    }
}
