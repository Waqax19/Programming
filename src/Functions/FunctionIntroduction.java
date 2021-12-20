package Functions;
public class FunctionIntroduction
{
    //void functions

    public static char printGrade(double score)
    {
        //when the type of the function is void, it will not return anything
        if (score >= 90)
        {
            return 'A';

        }
        else if(score >= 80.0)
        {
            return 'B';
        }

        else if(score >= 70.0)
        {
            return 'C';
        }

        else if (score >= 60.0)
        {
            return 'D';
        }

        return 'F';

    }

    public static void main(String[] args)
    {
        //calling the function
        System.out.println("The grade is : " + printGrade(70));

    }
}