package Challenges;

public class TIger extends Animal
{

        void eating()
        {
            System.out.println("Tiger is eating..");
        }


    public static void main(String[] args)
    {
        TIger a = new TIger();

        System.out.println(a instanceof Animal);
        a.eating();

    }
}
