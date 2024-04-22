package ObjectOrientation;

import java.util.Objects;

public class Student
{
    public static void main(String[] args)
    {
        boolean equalityCheck = Objects.equals(4 , null);

        System.out.println("The method returns : " + equalityCheck + " when the passed object are null");
    }
}
