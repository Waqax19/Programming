package Recursion;

public class TowerOFHanoi
{

    static void hanoi(int num, char fromTower, char auxTower, char toTower)
    {
        if(num == 1)
        {
            System.out.println("Disk 1 move from " + fromTower + " to " + toTower);
            return;
        }

        hanoi(num - 1, fromTower, toTower , auxTower);

        System.out.println("Disk " + num + " moved from " + fromTower + " to " + toTower);

        hanoi(num - 1, auxTower, fromTower, toTower);
    }

    public static void main(String[] args)
    {
        hanoi(4,'A','B','C');

    }
}
