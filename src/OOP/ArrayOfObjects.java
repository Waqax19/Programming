package OOP;

public class ArrayOfObjects
{
    int id;

    String name;

    ArrayOfObjects(int newId, String newName)
    {
        id = newId;

        name = newName;
    }

    public void display()
    {
        System.out.println("Emp Id : " + id + " " + " Employee Name : " + name);


    }


    public static void main(String[] args)
    {
        ArrayOfObjects[] obj = new ArrayOfObjects[2];

        System.out.println("First EMployee Data ");

        obj[0] = new ArrayOfObjects(100,"abcd");
        obj[1] =  new ArrayOfObjects(320,"xyz");

        obj[0].display();


        System.out.println("Second Employee Data : ");

        obj[1].display();

    }
}
