package Collections;

import java.util.Arrays;
import java.util.List;

public class SortingPoints
{
    public static void main(String[] args)
    {
        Point[] points = new Point[100];

        double point1 = (double) (Math.random() * 5);
        double point2 = (double) (Math.random() * 5);

        for (int i = 0; i < points.length;i++)
        {
            points[i] = new Point(point1, point2);
        }

        Arrays.sort(points);

        List<Point> list1 = Arrays.asList(points);
        //print them in increasing order

        System.out.println("\nPoints in increasing order of x-coordinate ");
        System.out.println(list1);

        Arrays.sort(points , new CompareY());

        List<Point> list2 = Arrays.asList(points);
        //print them in increasing order

        System.out.println("\nPoints in increasing order of y-coordinate ");
        System.out.println(list2);





    }
}
