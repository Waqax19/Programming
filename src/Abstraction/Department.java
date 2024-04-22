package Abstraction;

public class Department implements Cloneable
{
    String department_name = null;

    int department_id = 0;

    Department()
    {

    }

    Department(String department_name, int department_id)
    {
        this.department_name = department_name;
        this.department_id = department_id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Department d1 = new Department("CS" , 57);

        Department d2 = (Department) d1.clone();

        System.out.println(d2.department_id);
        System.out.println(d2.department_name);

    }
}
