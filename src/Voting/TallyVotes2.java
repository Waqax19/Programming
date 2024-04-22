package Voting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TallyVotes2
{
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("What file contains the ballot information? (type 'quit' to end the program)");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.nextLine();

        while (!fileName.equalsIgnoreCase("quit"))
        {
            Scanner input = new Scanner(new File(fileName));
            ArrayList<Ballot> ballots = readFile(input);
            int originalBallotCount = ballots.size();
            int round = 1;
            boolean done = false;

            while (!done)
            {
                System.out.println("Round #" + round);
                Collections.sort(ballots);
                done = oneRound(ballots);
                System.out.println("------------------------------");
                round++;
            }

            System.out.println("What file contains the ballot information? (type 'quit' to end the program)");
            fileName = keyboard.nextLine();
        }

        System.out.println("Goodbye!");
    }


    // Reads a data file of voter preferences, returning a list
    // of the resulting ballots. Candidate names are listed in
    // order of preference with tabs separating choices.
    public static ArrayList<Ballot> readFile(Scanner input) throws FileNotFoundException
    {
        ArrayList<Ballot> result = new ArrayList<>();
        while (input.hasNextLine())
        {
            String text = input.nextLine().trim();
            if (text.isEmpty())
            {

                result.add(new Ballot(text.split("\t")));
            }
        }
        return result;
    }

    // Performs one round of ranked choice voting. The candidate
    // with the lowest vote total is eliminated until some
    // candidate gets a majority or until we reach a tie between
    // only two candidates. Assumes the list is in order by
    // candidate name.
    public static boolean oneRound(ArrayList<Ballot> ballots)
    {
        String top = null;
        String bottom = null;
        int topCount = 0;
        int bottomCount = ballots.size() + 1;
        int index = 0;
        while (index < ballots.size())
        {
            String next = ballots.get(index).getCandidate();
            int count = processVotes(next, index, ballots);
            if (count > topCount)
            {
                topCount = count;
                top = next;
            }
            if (count < bottomCount)
            {
                bottomCount = count;
                bottom = next;
            }
            index += count;
        }
        if (topCount == bottomCount)
        {
            System.out.println("Election has no winner");
            return true;
        } else if (topCount > ballots.size() / 2.0)
        {
            System.out.println("Winner is " + top);
            return true;
        } else
        {
            System.out.println("no winner, eliminating " + bottom);
            eliminate(bottom, ballots);
            return false;
        }
    }

    // Counts and reports the votes for the next candidate
    // starting at the given index in the ballots list.
    public static int processVotes(String name, int index, ArrayList<Ballot> ballots)
    {
        int count = 0;
        while (index < ballots.size() && ballots.get(index).getCandidate().equals(name))
        {
            index++;
            count++;
        }
        double percent = 100.0 * count / ballots.size();
        System.out.printf("%d votes for %s (%4.1f%%)\n", count, name, percent);
        return count;
    }

    // Eliminates the given candidate from all ballots.
    public static void eliminate(String candidate, ArrayList<Ballot> ballots)
    {
        for (Ballot b : ballots)
        {
            b.eliminate(candidate);
        }
    }
}
