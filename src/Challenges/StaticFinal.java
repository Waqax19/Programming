package Challenges;

public class StaticFinal 
{
    final int intConstant = 55;


}


 class constExample
{
    public static void main(String[] args)
    {
       /* System.out.println("Value of int constant is : " + StaticFinal.intConstant);*/

        StaticFinal myObj1 = new StaticFinal();

        System.out.println("Value of integer constant is : " + myObj1.intConstant);

        StaticFinal myObj2 = new StaticFinal();

        System.out.println("Value for intCont is : " + myObj2.intConstant);

    }
}
