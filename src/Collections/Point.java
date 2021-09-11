package Collections;

public class Point implements Comparable<Point>
{
    private double x;
    private double y;


    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public int compareTo(Point o)
    {

        if(x == o.getX()) {


            if (y < o.getY()) {
                return 1;
            } else if (y > o.getY()) {
                return -1;
            } else
                return 0;

        }
        else if (x > o.getX())
        {
            return 1;
        }

        else
            return -1;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

  /*  @Override
    public int compareTo(Object o) {
        return 0;
    }*/
}
