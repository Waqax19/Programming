package Abstraction;

public class CountPeople
{
    public  int countPerson(int number , int countTillNow)
    {
        if (number == 1)
        {
            return countTillNow  + 1;
        }

        countTillNow++;

        number--;

        return countPerson(number, countTillNow);
    }

    public static void main(String[] args)
    {
        CountPeople myObj = new CountPeople();

        System.out.println(myObj.countPerson(10 , 0));
    }
}
