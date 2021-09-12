package Arrayss;

public class Students
{
    public int rollNum;

    public String name;

    public Students(int newRollNum, String newName)
    {
        rollNum = newRollNum;
        name = newName;
    }

    public static void main(String[] args)
    {
        Students[] array;

        array = new Students[5];


        array[0] = new Students(25,"Ali");
        array[1] = new Students(15,"Ahmed");
        array[2] = new Students(47,"Qasim");
        array[3] = new Students(48,"Asim");
        array[4] = new Students(9,"Ubaid");

        for (int i = 0; i < array.length; i++)
        {
            System.out.println("Element at : " + i + " : " + array[i].rollNum + " " + array[i].name);
        }


    }
}
