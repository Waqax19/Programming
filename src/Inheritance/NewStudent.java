package Inheritance;

import java.util.ArrayList;
import java.util.Iterator;

public class NewStudent
{
    int rollNum;

    String name;

    int age;

    NewStudent(int rollNum, String name, int age)
    {
        this.age = age;
        this.rollNum = rollNum;
        this.name = name;
    }

    public static void main(String[] args)
    {
        NewStudent myObj1 = new NewStudent(101, "Michael",25);
        NewStudent myObj2 = new NewStudent(12, "ALi",75);
        NewStudent myObj3 = new NewStudent(58, "David",50);

        ArrayList<NewStudent> myStd = new ArrayList<NewStudent>();

        myStd.add(myObj1);
        myStd.add(myObj2);
        myStd.add(myObj3);

        Iterator itr = myStd.iterator();

        while (itr.hasNext())
        {
            NewStudent st = (NewStudent) itr.next();

            System.out.println(st.rollNum  + "  " + st.age + " " + st.name);
        }

    }
}
