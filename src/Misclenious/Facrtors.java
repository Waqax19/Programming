package Misclenious;

import java.util.Locale;

public class Facrtors
{
    /*
    In Scrabble1 each player has a set of tiles with letters on them.
     The object of the game is to use those letters to spell words. The scoring system is complex,
     but longer words are usually worth more than shorter words.

    Imagine you are given your set of tiles as a string,
    like "quijibo", and you are given another string to test, like "jib".

    Write a method called canSpell that takes two strings and checks whether the set of tiles can spell the word.
    You might have more than one tile with the same letter, but you can use each tile only once.


     */

    public static boolean canSpell(String tiles, String word)
    {
        boolean[] used = new boolean[tiles.length()];

        for (int i = 0; i < used.length; i++)
        {
            used[i] = false;
        }

        boolean found;
        for (int i = 0; i < word.length(); i++)
        {
            found = false;

            for (int j = 0; j < tiles.length(); j++)
            {
                if(word.toLowerCase().charAt(i) == tiles.toLowerCase().charAt(j) &&(!used[j]))
                {
                    used[j] = true;
                    found = true;
                    break;
                }
            }

            if(!found)
            {
                return false;
            }
        }

        return true;

    }





}
