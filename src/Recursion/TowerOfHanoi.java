package Recursion;

import java.util.Scanner;

public class TowerOfHanoi
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number of disks ");

        int n = userInput.nextInt();

        System.out.println("The moves are : ");

        movingDisks(n, 'A', 'B','C');


    }

    public static void movingDisks(int n, char sourceTower, char destinationTower, char auxTower)
    {
        if(n == 1)
        {
            System.out.println("Move disk " + n + " from " + sourceTower + " to " + destinationTower);
        }


        else
        {
            movingDisks(n - 1, sourceTower, auxTower, destinationTower);

            System.out.println("Move disk " + n + " from " + sourceTower + " to " + destinationTower);

            movingDisks(n - 1, auxTower, destinationTower, sourceTower);

        }
    }
}
