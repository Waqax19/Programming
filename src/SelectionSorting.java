import java.util.ArrayList;

public class SelectionSorting
{
    public static void main(String[] args)
    {
        ArrayList<String> languages = new ArrayList<String>();

        languages.add("java");
        languages.add("python");
        languages.add("C++");

        System.out.println("Languages : " + languages);

        ArrayList<String> programmingLanguages = new ArrayList<String>();

        programmingLanguages.addAll(languages);

        System.out.println("Programming languages : " + programmingLanguages);

    }

}
