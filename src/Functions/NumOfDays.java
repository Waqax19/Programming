package Functions;

public class NumOfDays
{
    public static int numberOfDaysInAYear(int year)
    {

//2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048.

        int[] LeapYear = {2000, 2004, 2008, 2012, 2016, 2020};

        for (int i = 0; i <= LeapYear.length; i++)
        {
            if (year == LeapYear.length)
            {
                return year = 366;
            }
            else if (year != LeapYear.length)
            {
                return year = 365;
            }
            System.out.println(" The number in a year from 2000 to 2020: " + year);
        }
        return year;

    }

    public static int numberOfDaysInYear(int year)
    {
        if (isLeapYear(year))
            return 366;
        else
           return  365;
    }

    public static boolean isLeapYear(int year)
    {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }



    public static void main(String[] args)
    {

        System.out.println(numberOfDaysInAYear(2020));
    }
}
