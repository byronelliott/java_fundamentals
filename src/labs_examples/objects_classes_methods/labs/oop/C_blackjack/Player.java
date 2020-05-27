package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Player extends Hand {
    String name;

    public Player() {
    }

    public Player(String name) {
        super();
        this.name = name;
    }

    public Player(ArrayList<Card> cards) {
        super(cards);
    }

    public boolean computerAI(int handValue) {
        if (handValue < 16) return true;
        return false;
    }
}
