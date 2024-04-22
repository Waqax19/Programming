package Voting;

import java.util.*;

public class Ballot implements  Comparable<Ballot>
{
    private ArrayList<String> preferences;

    // constructs a ballot with the given candidate names in order
    public Ballot(String[] names)
    {
        preferences = new ArrayList<>();
        for (String next : names)
        {
            preferences.add(next);
        }
    }

    // returns the current first choice for this ballot or "none" if there are
    // no longer any choices for this ballot
    public String getCandidate()
    {
        if(!preferences.isEmpty())
        {
            return preferences.get(0);
        }

        else
        {
            return "none";
        }

    }

    // eliminates the given candidate from consideration
    public void eliminate(String name)
    {
        preferences.remove(name);
    }

    // compares this ballot to another, putting them in order
    // alphabetically by their first choice candidate
    public int compareTo(Ballot other)
    {
        return getCandidate().compareTo(other.getCandidate());
    }

    public boolean isEmpty()
    {
        return preferences.isEmpty();
    }
}