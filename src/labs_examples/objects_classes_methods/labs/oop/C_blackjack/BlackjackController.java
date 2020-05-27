package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackController {

    public static void main(String[] args) {

        playBlackJack();

    }

    public static boolean playBlackJack() {
        int winnings = 100;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Name");
        String name = scan.nextLine();
        System.out.println("Welcome " + name + ", time to play a game of Blackjack against the Computer!");


        while (true) {
            Player playerHand = new Player();
            Player computerHand = new Player();
            Card temp1 = playerHand.deal();
            Card temp2 = playerHand.deal();
            playerHand.setCards(new ArrayList<>());
            computerHand.setCards(new ArrayList<>());

            System.out.println(name + "'s hand");
            playerHand.getCards().add(temp1);
            playerHand.setHandValue(temp1.cardValue());
            playerHand.getCards().add(temp2);
            playerHand.setHandValue(temp2.cardValue());
            System.out.println(playerHand.getCards());
            System.out.println(playerHand.getHandValue());

            System.out.println("----------------");
            System.out.println("Computer's hand");
            temp1 = computerHand.deal();
            temp2 = computerHand.deal();
            computerHand.getCards().add(temp1);
            computerHand.setHandValue(temp1.cardValue());
            computerHand.getCards().add(temp2);
            computerHand.setHandValue(temp2.cardValue());
            System.out.println(computerHand.getCards());
            System.out.println(computerHand.getHandValue());

            System.out.println("How much money would you like to bet on this hand?");
            System.out.println("Your bet should be between 0 and " + winnings);
            int bet = scan.nextInt();

            playerDeal(playerHand, temp1, name);
            computerDeal(computerHand, temp1);
            compareHands(computerHand.getHandValue(), playerHand.getHandValue(), name);

            while (winnings >= bet || bet < 0) {
                if (compareHands(computerHand.getHandValue(), playerHand.getHandValue(), name) == true) {
                    winnings += bet;
                    System.out.println("You just added " + bet + " to your winnings :) " + winnings);
                } else {
                    winnings -= bet;
                    System.out.println("You just lost " + bet + " of your winnings :( " + winnings);
                }
                break;
            }

            if(winnings == 0) {
                System.out.println("Thanks for playing you are out of money");
                return false;
            }

            System.out.println(name + " would you like to play again?  y / n ");
            String answer = scan.next();
            if (answer.equals("n")) {
                return false;
            }
        }
    }

    public static void playerDeal(Player playerHand, Card temp, String name) {
        while (playerHand.getHandValue() < 21) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Would you like another card " + name + "?  y / n ");
            String response = scan.next();
            if (response.equals("y")) {
                temp = playerHand.deal();
                playerHand.getCards().add(temp);
                playerHand.setHandValue(temp.cardValue());
                System.out.println(name + "'s hand");
                System.out.println(playerHand.getCards());
                System.out.println(playerHand.getHandValue());
            } else {
                System.out.println("You are staying with your current hand");
                break;
            }
        }
    }

    public static void computerDeal(Player computerHand, Card temp) {
        while (computerHand.computerAI(computerHand.getHandValue())) {
            if (true) {
                System.out.println("The computer would like another card");
                temp = computerHand.deal();
                computerHand.getCards().add(temp);
                computerHand.setHandValue(temp.cardValue());
                System.out.println("Computer's hand");
                System.out.println(computerHand.getCards());
                System.out.println(computerHand.getHandValue());
            } else {
                System.out.println("Computer will stay");
            }
        }
    }

    public static boolean compareHands(int computerHand, int playerHand, String name) {
        if (computerHand > 21 && playerHand <= 21) {
            System.out.println("COMPUTER has Busted and " + name.toUpperCase() + " is the winner!");
            return true;
        } else if (playerHand > 21 && computerHand <= 21) {
            System.out.println(name.toUpperCase() + " has busted and the COMPUTER is the winner!");
        } else if (computerHand <= 21 && computerHand > playerHand) {
            System.out.println("The COMPUTER has won this game!");
        } else if (playerHand <= 21 && playerHand > computerHand) {
            System.out.println(name.toUpperCase() + " has won the game!");
            return true;
        } else if (playerHand == computerHand) {
            System.out.println("PUSH");
        }
        return false;
    }


}
