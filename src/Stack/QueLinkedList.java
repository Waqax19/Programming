package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueLinkedList
{
    public static void main(String[] args)
    {
        Queue myCities = new LinkedList();

        myCities.offer("Florence");
        myCities.offer("Paris");
        myCities.offer("AmsterDam");
        myCities.offer("Berlin");


        while (myCities.size() > 0 )
        {
            System.out.println(myCities.remove() + " ");
        }


    }
}
