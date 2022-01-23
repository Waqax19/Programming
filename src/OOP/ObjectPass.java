package OOP;

public class ObjectPass
{

    int x, y;

    ObjectPass(int i, int j)
    {
        x = i;
        y = j;
    }

    boolean equality(ObjectPass myObj)
    {
        return (myObj.x == x && myObj.y == y);
    }


    public static void main(String[] args)
    {
        ObjectPass myNObj = new ObjectPass(200,45);
        ObjectPass myObj2 = new ObjectPass(200,45);

        ObjectPass myObj3 = new ObjectPass(-55,-55);


        System.out.println("myNObj == myObj2 " + myNObj.equality(myObj2));

        System.out.println("myNobj == myObj3 " + myNObj.equality(myObj3));

    }
}