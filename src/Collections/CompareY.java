package Collections;

import java.util.Comparator;

public class CompareY implements Comparator<Point>
{
    @Override
    public int compare(Point o1, Point o2)
    {
        double pointx1 = o1.getX();
        double pointx2 = o2.getX();
        double pointy1 = o1.getY();
        double pointy2 = o2.getY();

        if(pointy1 == pointy2)
        {
            if(pointx1 < pointx2)
            {
                return -1;
            }

            else if(pointx1 == pointx2)
            {
                return 0;
            }

            else
                return 1;
        }

        else if(pointy1 < pointy2)
        {
            return -1;
        }

        else
            return 1;

    }
}
