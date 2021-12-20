package OOP;

public class Rectangle
{
    double width;

    double height;


    public Rectangle()//default
    {
//        width = 1;
  //      height = 1;
    }
    public Rectangle(double newWidth, double newHeight)
    {
        width = newWidth;

        height = newHeight;
    }


    public double getArea()
    {
        return (width * height);
    }

    public double getPerimeter()
    {
        return (width  +  height ) * 2;
    }


    public static void main(String[] args)
    {
        Rectangle myObj = new Rectangle();

        myObj.getArea();
        /*Rectangle myObj2 = new Rectangle(3.5, 35.9);

        System.out.println("Width of First Rectangle " + myObj.width);

        System.out.println("Height of First Rectangle " + myObj.height);

        System.out.println("Area of first Rectanle is " + myObj.getArea());

        System.out.println("perimter of first Rectangle is " + myObj.getPerimeter());
        //******************************************************************************
*/
       /* System.out.println("Width of  Rectangle " + myObj2.width);

        System.out.println("Height of Second Rectangle " + myObj2.height);

        System.out.println("Area of Second Rectanle is " + myObj2.getArea());

        System.out.println("perimter of Second Rectangle is " + myObj2.getPerimeter());

*/







    }
}
