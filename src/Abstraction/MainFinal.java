package Abstraction;

import java.util.*;

class Die
{

    public static final int MIN_SIDES = 2;

    public static final int MAX_SIDES = 100;

    public static final int DEFAULT_SIDES = 6;

    private static final Random generate = new Random();

    private int numSides;

    private int currentVal;

    private Random random;

    public Die()
    {
        random = new Random();
    }

    public Die(int numSides)
    {
        if (numSides < MIN_SIDES || numSides > MAX_SIDES)
        {
            throw new IllegalArgumentException("Number of sides must be between " + MIN_SIDES + " and " + MAX_SIDES);
        }

        this.numSides = numSides;
        roll();
    }

    public int getSideUp()
    {
        return currentVal;
    }

    public int roll()
    {
        return random.nextInt(6) + 1;
    }
}

class Player
{
    protected String name;
    protected int score;

    public Player(String name)
    {
        this.name = name;
        this.score = 0;
    }

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    public void addToScore(int points)
    {
        score += points;
    }

    public boolean wantsToHold()
    {
        return false;
    }
}

class HumanPlayer extends Player
{
    private Scanner scanner;

    public HumanPlayer(String name)
    {
        super(name);
        scanner = new Scanner(System.in);
    }

    @Override
    public boolean wantsToHold()
    {
        System.out.print(name + ", Hold? [y/n]: ");
        String input = scanner.nextLine().trim().toLowerCase();
        return input.equals("y");
    }
}

class AIPlayer extends Player
{
    public AIPlayer(String name)
    {
        super(name);
    }
}

class DumbAIPlayer extends AIPlayer
{
    private Random random;

    public DumbAIPlayer(String name)
    {
        super(name);
        random = new Random();
    }

    @Override
    public boolean wantsToHold()
    {
        return random.nextBoolean();
    }
}

class ThresholdAIPlayer extends AIPlayer
{
    private int threshold;

    public ThresholdAIPlayer(String name, int threshold)
    {
        super(name);
        this.threshold = threshold;
    }

    @Override
    public boolean wantsToHold()
    {
        return score >= threshold;
    }
}

class PigGame
{
    private Die die;
    private List<Player> players;
    private int targetScore;

    public void addPlayer(Player player)
    {
        players.add(player);
    }

    public void takeTurn(Player player)
    {
        int turnScore = 0;
        boolean endTurn = false;

        System.out.println(player.getName() + "'s turn:");

        if (player.getScore() >= targetScore)
        {
            System.out.println(player.getName() + " wins!");
        }
    }

    public PigGame(int numPlayers, int threshold)
    {
        die = new Die();
        players = new ArrayList<>();

        for (int i = 0; i < numPlayers; i++)
        {
            if (i == 0)
                players.add(new HumanPlayer("Human"));
            else if (i % 2 == 0)
                players.add(new DumbAIPlayer("Bot #" + (i - 1)));
            else
                players.add(new ThresholdAIPlayer("Bot #" + (i - 1), threshold));
        }

        targetScore = 100;
    }

    public void play()
    {
        int currentPlayerIndex = new Random().nextInt(players.size());
        Player currentPlayer;

        while (true)
        {
            currentPlayer = players.get(currentPlayerIndex);

            System.out.println("\n" + getPlayerScores());

            int turnScore = 0;
            boolean endTurn = false;

            System.out.println(currentPlayer.getName() + "'s turn:");

            while (!endTurn)
            {
                int roll = die.roll();
                System.out.println(currentPlayer.getName() + " rolled a " + roll);

                if (roll == 1)
                {
                    System.out.println("Rolled a 1! Turn ends with 0 points.");
                    endTurn = true;
                } else
                {
                    turnScore += roll;
                    System.out.println(currentPlayer.getName() + "'s current score for this turn: " + turnScore);

                    if (currentPlayer.wantsToHold() || currentPlayer.getScore() + turnScore >= targetScore)
                    {
                        currentPlayer.addToScore(turnScore);
                        System.out.println(currentPlayer.getName() + " holds.");
                        endTurn = true;
                    } else
                    {
                        System.out.println(currentPlayer.getName() + " rolls again.");
                    }
                }
            }

            if (currentPlayer.getScore() >= targetScore)
            {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }
    }

    private String getPlayerScores()
    {
        StringBuilder scores = new StringBuilder();
        for (Player player : players)
        {
            scores.append(player.getName()).append(": ").append(player.getScore()).append(" ");
        }
        return scores.toString();
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("PigGame Players:\n");
        for (Player player : players)
        {
            builder.append(player.getName()).append(": ").append(player.getScore()).append("\n");
        }
        return builder.toString();
    }
}

public class MainFinal
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many players? ");
        int numPlayers = scanner.nextInt();

        List<String> playerTypes = Arrays.asList("Human", "Dumb AI", "Threshold AI");
        List<Player> players = new ArrayList<>();

        for (int i = 0; i < numPlayers; i++)
        {
            System.out.println((i + 1) + ") " + playerTypes.get(i));
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1)
            {
                System.out.print("Name? ");
                String name = scanner.nextLine().trim();
                players.add(new HumanPlayer(name));
            } else if (choice == 2)
            {
                players.add(new DumbAIPlayer("Bot #" + i));
            } else if (choice == 3)
            {
                System.out.print("What threshold? ");
                int threshold = scanner.nextInt();
                players.add(new ThresholdAIPlayer("Bot #" + i, threshold));
            }
        }

        PigGame pigGame = new PigGame(numPlayers, 20);
        pigGame.play();
    }
}
