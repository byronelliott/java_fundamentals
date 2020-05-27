package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {
    String suit;
    String rank;
    String[] suits = {"♠", "♦", "♥", "♣"};
    String[] ranks = {"Ace", "2", "3", "4","5","6","7","8","9","10","Jack","Queen","King"};


    public Card() {
    }
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int cardValue() {
        switch (rank) {
            case "Ace":
                return 1;
            case "King":
            case "Queen":
            case "Jack":
                return 10;
            default:
                return Integer.parseInt(rank);
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
