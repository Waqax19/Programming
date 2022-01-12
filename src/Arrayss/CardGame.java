package Arrayss;

public class CardGame
{
    public static void main(String[] args)
    {
        int[] deck = new int[52];

        String[] suits = {"Spades","Hearts","Diamond","Clubs"};

        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","jack","Queen","King"};

        //initialize the cards

        for (int i = 0; i < deck.length; i++)
        {
            deck[i] = i;
        }

        //shuffle the cards
        for (int i = 0; i < deck.length; i++)
        {
            //random function
            int index = (int) (Math.random() * deck.length);

            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;

        }

        for (int i = 0; i < 4; i++)
        {
            String suit = suits[deck[i] / 13];

            String rank = ranks[deck[i] % 13];


            System.out.println("Card Number " + deck[i] + " : " + rank + " of " + suit);
        }

    }
}
