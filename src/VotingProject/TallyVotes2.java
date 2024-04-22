package VotingProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class TallyVotes2
{
    private static int originalBallotCount;

    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("What file contains the ballot information? (Type 'quit' to end the program)");
        Scanner keyboard = new Scanner(System.in);
        String fileName;

        while (true)
        {
            fileName = keyboard.nextLine();
            if (fileName.equals("quit"))
            {
                System.out.println("Goodbye!");
                break;
            }

            Scanner input = new Scanner(new File(fileName));
            ArrayList<Ballot> ballots = readFile(input);
            originalBallotCount = ballots.size();
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

            System.out.println("What file contains the ballot information? (Type 'quit' to end the program)");
        }
    }

    public static ArrayList<Ballot> readFile(Scanner input)
    {
        ArrayList<Ballot> result = new ArrayList<>();
        while (input.hasNextLine())
        {
            String text = input.nextLine();
            if (!text.trim().isEmpty())
            {
                result.add(new Ballot(text.split("\t")));
            }
        }
        return result;
    }

    public static boolean oneRound(ArrayList<Ballot> ballots)
    {
        String top = null;
        String bottom = null;
        int topCount = 0;
        int bottomCount = ballots.size() + 1;
        int index = 0;

        ballots.removeIf(Ballot::isEmpty);

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
        } else if (topCount > (originalBallotCount / 2.0))
        {
            System.out.println("Winner is " + top);
            return true;
        } else
        {
            System.out.println("No winner, eliminating " + bottom);
            eliminate(bottom, ballots);
            return false;
        }
    }

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

    public static void eliminate(String candidate, ArrayList<Ballot> ballots)
    {
        for (Ballot b : ballots)
        {
            b.eliminate(candidate);
        }
    }
}
