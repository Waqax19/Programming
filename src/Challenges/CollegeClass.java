package Challenges;

import java.util.ArrayList;
import java.util.List;

public class CollegeClass
{
    String collegeName;

    private List<CourseClass> courses;

    CollegeClass(String collegeName, List<CourseClass> courseClasses)
    {
        this.collegeName = collegeName;

        this.courses = courseClasses;
    }


    public int countStudents()
    {
        int studentsInCollege = 0;

        List<StudentClass> students;

        //extended for loop
        for (CourseClass courseVar : courses)
        {
            students = courseVar.studentData();

            for (StudentClass student : students)
            {
                studentsInCollege++;
            }

        }
        return studentsInCollege;
    }


    public static void main(String[] args)
    {
        StudentClass myObj1 = new StudentClass("David",25,"CS");
        StudentClass myObj2 = new StudentClass("Michael",78,"History");
        StudentClass myObj3 = new StudentClass("Sarah",61,"History");
        StudentClass myObj4 = new StudentClass("Ali",19,"Chemistry");


        List<StudentClass> collegeStudents = new ArrayList<StudentClass>();


        collegeStudents.add(myObj2);
        collegeStudents.add(myObj3);


        List<StudentClass> cs_Students = new ArrayList<StudentClass>();
        cs_Students.add(myObj1);

        List<StudentClass> chemStudent = new ArrayList<StudentClass>();
        chemStudent.add(myObj4);


        CourseClass cs = new CourseClass("CS", cs_Students);
        CourseClass phy = new CourseClass("Physics", collegeStudents);
        CourseClass chem = new CourseClass("Chemistry", chemStudent);


        List<CourseClass> courseClasses = new ArrayList<CourseClass>();

        courseClasses.add(chem);
        courseClasses.add(phy);
        courseClasses.add(cs);




        CollegeClass college = new CollegeClass("College Of Excellence", courseClasses);

        System.out.println("Total number of students in the college  : " + college.collegeName + " is " + college.countStudents() );


    }



}
