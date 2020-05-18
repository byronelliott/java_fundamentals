package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck extends Card {
    ArrayList<Integer> usedCards = new ArrayList<>();
    Card[] cards;


    public Deck() {
        Card[] cards = new Card[52];
        int count = 0;
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards[count] = new Card(ranks[i], suits[j]);
                count++;
            }
        }
        this.cards = cards;
        for (Card a : cards) {
            System.out.println(a);
        }
    }

    public void deal(int numCards) {
        Hand deckHand = new Hand();
        deckHand.setCards(new ArrayList<>());
        Random rand = new Random();
        for (int z = 0; z < numCards; z++) {
            int deck_int1 = rand.nextInt(52);
            if (usedCards.size() >= 52) System.out.println("Deck is Empty!");
            for (int y = 0; y <= usedCards.size();y++) {
                if (y == deck_int1) {
                    deck_int1 = rand.nextInt(52);
                }
                else {
                    System.out.println(cards[deck_int1]);
                    usedCards.add(deck_int1);
                    deckHand.getCards().add(cards[deck_int1]);
                    System.out.println(usedCards.size());
                    break;
                }
            }
        }
    }
}
