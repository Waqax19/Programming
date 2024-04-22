package CaseStudies;

public class TuitionFee
{
    public static void main(String[] args)
    {
        double tuitionFee = 10000;

        double year = 0;

        while (tuitionFee < 20000)
        {
            tuitionFee = tuitionFee * 1.07;
            year++;

        }

        System.out.println("Tuition fee will be doubled in : " + year + " years");

    }



}
