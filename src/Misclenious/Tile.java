package Misclenious;

public class Tile
{

    //. A Scrabble tile consists of a letter (use the "char" type) and a value (use an integer).
    char scrabble;
    int value;

    public Tile(char letter, int value) {
        this.scrabble = letter;
        this.value = value;
    }

    //* Implement the toString() method so that a Scrabble tile with letter 'Z' and value 10 should return "Z: 10".


    @Override
    public String toString()
    {
        return this.scrabble + " : " + this.value;
    }

    //compareTO
    public int compareTo(Tile myTile)
    {
        return this.value - myTile.value;
    }
}
