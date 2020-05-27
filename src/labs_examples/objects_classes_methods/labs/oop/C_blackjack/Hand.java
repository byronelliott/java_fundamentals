package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand extends Deck {
    public ArrayList<Card> cards;
    int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Hand() {

    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue += handValue;
    }

    public String overTwentyOne(int handValue) {
        if (handValue <= 21) return "Your hand is under 21";
        if (handValue == 21) return "BlackJack!";
        return "Your hand is over 21 ----- BUST";
    }

}
