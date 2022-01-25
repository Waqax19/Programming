package OOP;

public class Wrappers
{

    public static void main(String[] args)
    {


        Integer i = new Integer(3);

        int j = i.intValue();//un-boxing , Convert Interger to int , explicitly
        //auto-boxing , conversion of primitive type to wrapper (object)

        int a = i;//unboxing

        System.out.println(a + " " + i + " " + j);

    }
}
