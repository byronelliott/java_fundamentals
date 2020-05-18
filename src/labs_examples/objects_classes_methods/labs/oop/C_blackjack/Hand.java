package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand{
   public ArrayList<Card> cards;
    int handValue;

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
}
