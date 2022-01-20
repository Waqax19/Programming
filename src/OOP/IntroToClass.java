package OOP;

public class IntroToClass
{
    //student
    int id;

    String name;// = "David";

   /* public IntroToClass(int newId, String newName)
    {
        id = newId;
        name = newName;
    }*/

    public void insertRecord(int newId, String newName)
    {
        id = newId;
        name = newName;
    }


    public void displayInformation()
    {
        System.out.println(id + " and " + name);
    }

   /* public static void main(String[] args)
    {
        //instance variable/object of the class
        IntroToClass myObject = new IntroToClass();
        IntroToClass myObject1 = new IntroToClass();

        myObject.insertRecord(121,"Ali");
        myObject1.insertRecord(45,"David");

        myObject.displayInformation();
        myObject1.displayInformation();


    }*/

}
