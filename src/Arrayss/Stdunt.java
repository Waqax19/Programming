package Arrayss;

import java.util.ArrayList;
import java.util.Iterator;

public class Stdunt
{
    int rollNum;

    String name;

    int age;

    Stdunt(int rollNum, String name ,int age)
    {
        this.rollNum = rollNum;

        this.name = name;

        this.age = age;
    }

    public static void main(String[] args)
    {
        Stdunt myObj = new Stdunt(25,"David",27);

        Stdunt myObj1 = new Stdunt(48,"Asim",12);

        Stdunt myObj2 = new Stdunt(74,"Michael",21);


        ArrayList<Stdunt> myNObj = new ArrayList<Stdunt>();

        myNObj.add(myObj);

        myNObj.add(myObj1);

        myNObj.add(myObj2);

        Iterator iterator = myNObj.iterator();

        while (iterator.hasNext())
        {
            Stdunt st = (Stdunt) iterator.next();

            System.out.println(st.rollNum + " " + st.name + " " + st.age);
        }

    }
}
