package Misclenious;

public class Main
{
    public static void main(String[] args)
    {
        Tile t1 = new Tile('A', 2);
        System.out.println(t1);
        Tile t2 = new Tile('Z', 10);

        if (t1.compareTo(t2) < 0) {
            System.out.println(t2 + " is bigger than " + t1);
        } else if (t1.compareTo(t2) > 0) {
            System.out.println(t1 + " is bigger than " + t2);
        } else {
            System.out.println(t1 + " = " + t2);
        }
    }
}