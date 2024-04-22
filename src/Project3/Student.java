package Project3;

import java.util.*;

public class Student
{

    public static final int NOBODY = -1;

    private int SID;
    private String firstName;
    private String lastName;
    private List<String> classes;
    // for now we are NOT going to list classes
    // from previous quarters

    public Student(int SID, String firstName, String lastName, List<String> curClasses)
    {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = curClasses;
    }

    public int getSID()
    {
        return SID;
    }

    public void setSID(int SID)
    {
        this.SID = SID;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public List<String> getClasses()
    {
        return this.classes;
    }

    public void setClasses(List<String> classes)
    {
        this.classes = classes;
    }

    @Override
    public String toString()
    {
        return "{" + " SID='" + getSID() + "'" + ", firstName='" + getFirstName() + "'" + ", lastName='" + getLastName()
                + "'" + ", classes='" + getClasses() + "'" + "}";
    }
}
