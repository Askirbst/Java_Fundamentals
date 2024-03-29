package labs_examples.objects_classes_methods.labs.oop.C_blackjack.blackjackgame;

import java.util.Arrays;

public class Card {

    public final static int SPADES = 0, HEARTS = 1, DIAMONDS = 2, CLUBS = 3; // Codes for the 4 suits.
    public final static int ACE = 1, JACK = 11, QUEEN = 12, KING = 13;
    private final int suit;
    private final int value;

    public Card(int theValue, int theSuit){
        value = theValue;
        suit = theSuit;
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuitAsString(){
        // Return a String representing the card's suit.
        // (If the card's suit is invalid, "??" is returned.)
        switch (suit){
            case SPADES: return "Spades";
            case HEARTS: return "Hearts";
            case DIAMONDS: return "Diamonds";
            case CLUBS: return "Clubs";
            default: return "??";
        }
    }

    public String getValueAsString(){
        // Return a String representing the card's value.
        // If the card's value is invalid, "??" is returned.
        switch (value){
            case 1: return "Ace";
            case 2: return "2";
            case 3: return "3";
            case 4: return "4";
            case 5: return "5";
            case 6: return "6";
            case 7: return "7";
            case 8: return "8";
            case 9: return "9";
            case 10: return "10";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "??";

        }
    }

    public String toString(){
        // Return a String representation of this card, such as
        // "10 of Hearts" or "Queen of Spades".
        return getValueAsString() + " of " + getSuitAsString();
    }

}
