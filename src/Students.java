public class Students
{
    String name;

    int rollNum;

    Students(int newRollNum, String newName)
    {
        rollNum = newRollNum;

        name = newName;
    }

    @Override
    public String toString()
    {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                '}';
    }
}
