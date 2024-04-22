package Challenges;

import Searching.LinearSearch;

import java.util.List;

public class CourseClass
{
        String name;

        private List<StudentClass> students;


        CourseClass(String name, List<StudentClass> students)
        {
            this.name = name;

            this.students = students;
        }

        public List<StudentClass> studentData()
        {
            return students;
        }



}
