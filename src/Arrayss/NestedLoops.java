package Arrayss;

public class NestedLoops
{
    public static void main(String[] args) {

       for (int i = 0; i <=10; i++)
       {

           if(i == 2 || i == 3 || i == 4)
             continue;//skip that part and go to the next one

           System.out.println("i is : " + i);

       }
    }
}
