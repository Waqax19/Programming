package ObjectOrientation;

public class Bug
{
    private int position;
    private boolean right;
    
    public Bug(int position)
    {
        this.position = position;
        right = true;
    }

    public void turn()
    {
        right = !right;
    }

    public void move()
    {
        if (right)
        {
           position++;
        }
        else
        {
            position--;
        }
    }

    public int getPosition()
    {
        return position;
    }

    public static void main(String[] args)
    {
        Bug myBug = new Bug(10);
        System.out.println("Expected = 10 , Actual = " + myBug.getPosition());

        myBug.move();

        System.out.println("Expected = 11 , Actual = " + myBug.getPosition());

        myBug.move();
        System.out.println("Expected = 12 , Actual = " + myBug.getPosition());

        myBug.move();

        System.out.println("Expected = 13 , Actual = " + myBug.getPosition());



        myBug.turn();

        System.out.println("after turn , Actual = " + myBug.getPosition());

        myBug.move();

        System.out.println("move after turn : Actual = " + myBug.getPosition());

        System.out.println("The final result is : " + myBug.getPosition());


    }
}
