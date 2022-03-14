package LIstss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class NameComparator implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if(s1.rollNum == s2.rollNum)
        {
            return 0;
        }
        else if (s1.rollNum > s2.rollNum)
            return 1;

        else
            return -1;
    }


    public static void main(String[] args)
    {
        ArrayList arrayList = new ArrayList();

        arrayList.add(new Student(105,"Ahmad",25));

        arrayList.add(new Student(112,"Jacob",28));

        arrayList.add(new Student(108,"David",19));

        Collections.sort(arrayList, new NameComparator());

        System.out.println("Sorting by Name ");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext())
        {
            Student student = (Student) iterator.next();

            System.out.println(student.rollNum + " " + student.name + " " + student.age);
        }

        System.out.println("Sorting by Age ");

        Collections.sort(arrayList, new NameComparator());

        Iterator iterator1 = arrayList.iterator();

        while (iterator1.hasNext())
        {
            Student student = (Student) iterator1.next();

            System.out.println(student.rollNum + " " + student.name + " " + student.age);
        }

        /*System.out.println("Sorting by RollNum ");

        Collections.sort(arrayList, new AgeComparator());

        Iterator iterator1 = arrayList.iterator();

        while (iterator1.hasNext())
        {
            Student student = (Student) iterator1.next();

            System.out.println(student.rollNum + " " + student.name + " " + student.age);
        }*/



    }

}
