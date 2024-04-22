package Challenges;

public class Natural
{
    /*
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
     */
    double sumOfNum = 0;
    int sqSum = 0;

    public double sum()
    {
        for (int i = 1; i <= 100; i++)
        {
            sumOfNum += i * i;
        }

        return sumOfNum;
    }

    public double sqaureOfSum()
    {
        for (int i = 1; i <= 100; i++)
        {
            sqSum += i;

        }

        return sqSum * sqSum;
    }

    public static void main(String[] args)
    {
        Natural myObj = new Natural();

        double sum = myObj.sum();

        double newSum = myObj.sqaureOfSum();

        System.out.println(sum);

        System.out.println(newSum);

        double difference = newSum - sum;

        System.out.printf("%.0f%n", difference);
        //System.out.println(difference);

    }
}
