package ObjectOrientation;

public class CoralReef extends Exhibit
{
    public CoralReef()
    {
        super("Coral Reef");
    }

    public void displayExhibitInfo()
    {
        super.displayExhibitInfo();
        System.out.println("You will find Anemones coral and fan coral , sea shell , sand dollars..");
    }

    public static void main(String[] args)
    {
        Exhibit[] exhibits = new Exhibit[3];

        exhibits[0] = new ShallowPool();

        exhibits[1] = new SharkTank();

        exhibits[2] = new CoralReef();

        for (Exhibit exh : exhibits)
        {
            exh.displayExhibitInfo();
        }

    }

}
