package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface NewTEst
{
    /*The rules of the game:

• A random number from 3 - 7 is chosen, and the board is set up with 3 stones in the ﬁrst row.

• Player one makes a move by picking a row and declaring how many stones they will take from that row.

• Player two makes a move.

• Play continues, swapping back and forth between the players, until someone takes the last stone.

• Whoever takes the last stone wins.

We will NOT be implementing this entire game here. We will instead implement several small components of the game:

(a) Design the Player interface. Recall that Players need to be able to:

• Choose a row to take from.

• Choose a number of stones to take from that row.

public interface Player {

// declare, but DO NOT IMPLEMENT
// all the methods a Player should be able to handle

     */

    public void choseRow(int[] row);

    public int stones(int n);

    public void players();

    public void rules();

    public void win(int strategy);


}
