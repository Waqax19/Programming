package ObjectOrientation;

public class Exhibit
{
    private String name;

    public Exhibit(String name)
    {
        this.name = name;
    }

    public void displayExhibitInfo()
    {
        System.out.println("In the " + name + " exhibit...");
    }
}
