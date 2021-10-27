package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjackgame;

import java.util.ArrayList;

public class Deck {

    private Card[] deck;   // An array of 52 Cards, representing the deck.
    private int cardsUsed;  // How many cards have been dealt from the deck.

    public Deck(){
        //Create an unshuffled deck of cards
        deck = new Card[52];
        int cardCt = 0;
        for(int suit = 0; suit <= 3; suit++){
            for(int value = 0; value <= 13; value++){
                deck[cardCt] = new Card(value, suit);
                cardCt++;
            }
        }
        cardsUsed = 0;
    }

    public void shuffle(){
        //Put all the used cards back into the deck, and shuffle it into a random order.
        for(int i = 51; i > 0; i--){
            int rand = (int)(Math.random() * (i + 1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }

    public int cardsLeft(){
        //As cards are dealt from the deck, the number of cards left decreases.
        //This function returns the number of cards that are still left in the deck.
        return 52 - cardsUsed;
    }

    public Card dealCard(){
        //Deals one card from the deck and returns it.
        if(cardsUsed == 52)
            shuffle();
        cardsUsed++;
        return deck[cardsUsed - 1];
    }

}
