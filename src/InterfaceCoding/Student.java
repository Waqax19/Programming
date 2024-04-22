package InterfaceCoding;

public class Student implements Cloneable
{
    int id;
    String name;

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args)
    {
        Student myObj = new Student(255,"Veeka");

        System.out.println(myObj.id + " " + myObj.name);

        try {
            Student myObj2 = (Student) myObj.clone();
            System.out.println(myObj2.id + " " + myObj2.name);
        }
        catch (Exception e)
        {
            System.out.println(myObj.toString());
        }

    }
}
