package Collections;

import java.util.Arrays;
import java.util.List;

/*
(Sort points in a plane) Write a program that meets the following requirements:
■ Define a class named Point with two data fields x and y to represent a
point’s x- and y-coordinates. Implement the Comparable interface for comparing the points on x-coordinates. If two points have the same x-coordinates,
compare their y-coordinates.
■ Define a class named CompareY that implements Comparator<Point>.
Implement the comparemethod to compare two points on their y-coordinates.
If two points have the same y-coordinates, compare their x-coordinates.
■ Randomly create 100 points and apply the Arrays.sort method to display
the points in increasing order of their x-coordinates and in increasing order
of their y-coordinates, respectively.
 */
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
