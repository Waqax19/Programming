package OOP;

public class DriverForIntro
{
/*    public static void main(String[] args)
    {
        //instance variable/object of the class
        IntroToClass myObject = new IntroToClass();
        IntroToClass myObject1 = new IntroToClass();

        myObject.insertRecord(121,"Ali");
        myObject1.insertRecord(45,"David");
    }*/

    public static void main(String[] args)
    {
        //instance variable/object of the class
        IntroToClass myObject = new IntroToClass();
        IntroToClass myObject1 = new IntroToClass();

        myObject.insertRecord(121,"Ali, this is driver class");
        myObject1.insertRecord(45,"David");

        myObject.displayInformation();
        myObject1.displayInformation();


    }

}
