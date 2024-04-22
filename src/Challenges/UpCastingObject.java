package Challenges;

public class UpCastingObject
{
    public static void main(String[] args)
    {
        ParentClass myObj = (ParentClass) new ChildClass();

        ParentClass myObj2 =  new ChildClass();

        myObj.display();
        myObj2.display();

    }
}
