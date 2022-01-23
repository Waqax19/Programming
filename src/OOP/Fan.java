package OOP;

public class Fan
{
    /*
    ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
    denote the fan speed.
    */

    final static int SLOW = 1;
    final static  int MEDIUM = 2;
    final static int FAST = 3;
      /*  ■ A private int data field named speed that specifies the speed of the fan (the
default is SLOW).*/
    private int speed;

      /*  ■ A private boolean data field named on that specifies whether the fan is on (the
default is false).*/
    private boolean on;

    /*    ■ A private double data field named radius that specifies the radius of the fan
(the default is 5).*/

    private double radius;

    /*■ A string data field named color that specifies the color of the fan (the default
is blue).*/
    String color;

    /*■ A no-arg constructor that creates a default fan.*/

    Fan()
    {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    /*■ The accessor and mutator methods for all four data fields.*/

    public String getSpeed()
    {
        String s = "";

        switch (speed)
        {
            case SLOW:
            s = "SLOW";
            break;

            case MEDIUM:
                s = "MEDIUM";
                break;

            case FAST:
                s = "FAST";
                break;
        }
        return s;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void turnOn()
    {
        on = true;
    }

    public void turnOff()
    {
        on = false;
    }



    public void setColor(String color) {
        this.color = color;
    }

    /*■ A method named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string.*/

    @Override
    public String toString() {
        if(on)
        {
            return "\nFan Speed: " + getSpeed() + " color " + getColor() + " radius : " + getRadius();
        }

        else
        {
            return "\nFan Color : " + getColor() + " radius " + getRadius() + " Fan speed " + getSpeed()  + " Fan is off";
        }
    }

    public static void main(String[] args)
    {
        /*
        Write a test
                program that creates two Fan objects. Assign maximum speed, radius 10, color
                yellow, and turn it on to the first object. Assign medium speed, radius 5, color
                blue, and turn it off to the second object. Display the objects by invoking their
                toString method.
         */
        final int SLOW = 1;
        final  int MEDIUM = 2;
        final  int FAST = 3;


        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.turnOn();

        fan2.setSpeed(MEDIUM);
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.turnOff();


        System.out.println(fan1.toString());

        System.out.println(fan2.toString());


    }
}
