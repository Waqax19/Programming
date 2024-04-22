package Abstraction;

public class CopyConstructor
{
    String website;

    CopyConstructor(String w)
    {
        website = w;
    }

    //this is copy constructor, it copies the value of one object to another object
    CopyConstructor(CopyConstructor cc)
    {
        website = cc.website;
    }

    void display()
    {
        System.out.println("Constructor : " + website);
    }

    public static void main(String[] args)
    {
        CopyConstructor obj1 = new CopyConstructor("This is the example of copy constructor..");

        CopyConstructor obj2 = new CopyConstructor(obj1);

        obj1.display();
        obj2.display();
    }
}
