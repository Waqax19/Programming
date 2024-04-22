// This program creates a list of students and allows the user to 
// lookup information about a student given the ID number.
// This is meant to loosely simulate what happens at the Student
// Services desk (Kodiak Corner here at Cascadia College).
//
// In real life when a student scans their Student ID card
// the computer reads their Student ID Number from the bar code
// The computer then looks up the information about the student
// and allows the employee to look and and modify the information.
//
package Project3;

import java.util.*;

public class Student_Services_Desk
{

    private static int nextSID = 22; // must be greater than any of the Students' IDs that we pre-load

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        Map<Integer, Student> studentInfo = new TreeMap<Integer, Student>();
        studentInfo.put(21, new Student(21, "Zog", "TheDestroyer",
                new ArrayList<String>(List.of("BIT 143", "MATH 411", "ENG 120"))));
        studentInfo.put(20, new Student(20, "Mary", "Sue", new ArrayList<String>(List.of("BIT 142", "MATH 142", "ENG 100"))));
        studentInfo.put(1, new Student(1, "Joe", "Bloggs", new ArrayList<String>(List.of("BIT 115", "MATH 141", "ENG 101"))));

        char choice = 'L'; // anything but 'q' is fine
        while (choice != 'q')
        {
            System.out.println("\nWhat would you like to do next? ");
            System.out.println("F - Find a specific student");
            System.out.println("L - List all the students (for debugging purposes)");
            System.out.println("A - Add a new student");
            System.out.println("D - Delete an existing student");
            System.out.println("M - Modify an existing student");
            System.out.println("Q - Quit (exit) the program");
            System.out.print("What is your choice?\n(type in the letter & then the enter/return key) ");
            choice = keyboard.nextLine().trim().toLowerCase().charAt(0);
            System.out.println();

            switch (choice)
            {
                case 'f':
                    System.out.println("Find a student (based on their ID number):\n");
                    System.out.print("What is the ID number of the student to find? ");
                    int idToFind = keyboard.nextInt();
                    keyboard.nextLine(); // Consume the newline character
                    Student studentToFind = studentInfo.get(idToFind);
                    if (studentToFind != null)
                    {
                        System.out.println(studentToFind.getLastName() + ", " + studentToFind.getFirstName() +
                                " (SID=" + studentToFind.getSID() + ")");
                        System.out.println("Classes:");
                        for (String className : studentToFind.getClasses())
                        {
                            System.out.println("\t" + className);
                        }
                    } else
                    {
                        System.out.println("Didn't find a student with ID # " + idToFind);
                    }
                    break;

                case 'l':
                    System.out.println("The following students are registered:");
                    for (Student student : studentInfo.values())
                    {
                        System.out.println(student);
                    }
                    break;

                case 'a':
                    System.out.println("Adding a new student\n");
                    System.out.println("Please provide the following information:");
                    int newSID = nextSID++;
                    System.out.print("Student's first name? ");
                    String newFirstName = keyboard.nextLine();
                    System.out.print("Student's last name? ");
                    String newLastName = keyboard.nextLine();
                    List<String> newClasses = new ArrayList<>();
                    while (true)
                    {
                        System.out.print("Type the name of class, or leave empty to stop.  Press enter/return regardless: ");
                        String className = keyboard.nextLine();
                        if (className.isEmpty())
                        {
                            break;
                        }
                        newClasses.add(className);
                    }
                    studentInfo.put(newSID, new Student(newSID, newFirstName, newLastName, newClasses));
                    break;

                case 'd':
                    System.out.println("Deleting an existing student\n");
                    System.out.print("What is the ID number of the student to delete? ");
                    int idToDelete = keyboard.nextInt();
                    keyboard.nextLine(); // Consume the newline character
                    Student deletedStudent = studentInfo.remove(idToDelete);
                    if (deletedStudent != null)
                    {
                        System.out.println("Student account found and removed from the system!");
                    } else
                    {
                        System.out.println("Didn't find a student with ID # " + idToDelete);
                    }
                    break;

                case 'm':
                    System.out.println("Modifying an existing student\n");
                    System.out.print("What is the ID number of the student to modify? ");
                    int idToModify = keyboard.nextInt();
                    keyboard.nextLine(); // Consume the newline character
                    Student studentToModify = studentInfo.get(idToModify);
                    if (studentToModify != null)
                    {
                        System.out.println("Student account found!");
                        System.out.println("For each of the following type in the new info or leave empty to keep the existing info.  Press enter/return in both cases.");
                        System.out.print("Student's first name: " + studentToModify.getFirstName() + " New first name? ");

                         newFirstName = keyboard.nextLine();

                        if (!newFirstName.isEmpty())
                        {
                            studentToModify.setFirstName(newFirstName);
                        }
                        System.out.print("Student's last name: " + studentToModify.getLastName() + " New last name? ");
                         newLastName = keyboard.nextLine();
                        if (!newLastName.isEmpty())
                        {
                            studentToModify.setLastName(newLastName);
                        }
                        List<String> currentClasses = studentToModify.getClasses();
                        System.out.println("Updating class list");
                        System.out.println("Here are the current classes: " + currentClasses);
                        System.out.println("This program will go through all the current classes.");
                        for (int i = 0; i < currentClasses.size(); i++)
                        {
                            String className = currentClasses.get(i);
                            System.out.println(className);
                            System.out.print("Type d<enter/return> to remove, or just <enter/return> to keep: ");
                            String removeChoice = keyboard.nextLine();
                            if (removeChoice.equalsIgnoreCase("d"))
                            {
                                currentClasses.remove(i);
                                i--;
                            }
                        }
                        while (true)
                        {
                            System.out.print("Type the name of the class you'd like to add, or leave empty to stop.  Press enter/return regardless: ");
                            String className = keyboard.nextLine();
                            if (className.isEmpty())
                            {
                                break;
                            }
                            currentClasses.add(className);
                        }
                        System.out.println("Here's the student's new, updated info: " + studentToModify);
                    } else
                    {
                        System.out.println("Didn't find a student with ID # " + idToModify);
                    }
                    break;

                case 'q':
                    System.out.println("Thanks for using the program - goodbye!\n");
                    break;

                default:
                    System.out.println("Sorry, but I didn't recognize the option " + choice);
                    break;
            }
        }
    }
}
