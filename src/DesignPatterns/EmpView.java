package DesignPatterns;

public class EmpView
{

    public void employeeDetails(String name, int id, int wages, String description)
    {
        System.out.println("Details of an Employee ... ");

        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Wages : " + wages);
        System.out.println("Description : " + description);


    }
}
