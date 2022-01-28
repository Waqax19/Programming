package Inheritance;

public class Lion extends Animal
{
  static void myMethod(Animal a)
  {
      /*if (a instanceof Lion)
      {*/
          Lion myLion = (Lion) a;

          System.out.println("Yes we performed type casting successfully...");
     // }
  }

    public static void main(String[] args)
    {
        Animal a = new Lion();

        Lion.myMethod(a);

    }
}
