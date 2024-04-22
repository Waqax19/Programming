package NewCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class NameComparator implements Comparator<Student>
{

    public int compare(Student o1, Student o2)
    {

        return o1.name.compareTo(o2.name);
    }

    public static void main(String[] args)
    {
        ArrayList<Student> myList = new ArrayList<Student>();

        myList.add(new Student(45,19,"Ahmad"));
        myList.add(new Student(98,25,"Paul"));
        myList.add(new Student(64,17,"Jim"));

        Collections.sort(myList, new AgeComparator());

        Iterator itr = myList.iterator();

        while (itr.hasNext())
        {
            Student st = (Student) itr.next();

            System.out.println(st.rollNum + " " + st.name + " " + st.age);
        }
        System.out.println("_____________________________________");

        System.out.println("Sorting by Name ");

        Collections.sort(myList, new NameComparator());

        Iterator itr2 = myList.iterator();

        while (itr2.hasNext())
        {
            Student st = (Student) itr2.next();

            System.out.println(st.rollNum + " " + st.name + " " + st.age);
        }

    }



}
