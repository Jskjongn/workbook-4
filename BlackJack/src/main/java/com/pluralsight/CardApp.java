package com.pluralsight;

public class CardApp {

    public static void main(String[] args) {

        //create the deck
        Deck deck = new Deck();
        deck.shuffle();

        //create the hand and players
        Hand playerOneHand = new Hand();
        playerOneHand.newPlayer();
        Hand playerTwoHand = new Hand();
        playerTwoHand.newPlayer();

        // deal 5 cards from the deck and add them to the hand
        for (int i = 0; i < 3; i++) {
            // get a card from the deck
            Card card1 = deck.deal();
            Card card2 = deck.deal();
            // deal that card to the hand
            playerOneHand.deal(card1);
            playerTwoHand.deal(card2);
        }

        //print out the value of all the cards in the hand
        System.out.println(playerOneHand.getName() + "'s hand is worth " + playerOneHand.getValue());
        System.out.println(playerTwoHand.getName() + "'s hand is worth " + playerTwoHand.getValue());

        // if player one is greater than player two and if player one's card count is less than or equal to 21
        if (playerOneHand.getValue() > playerTwoHand.getValue()) {
            if (playerOneHand.getValue() <= 21) {
                System.out.println(playerOneHand.getName() + " wins the game!");
            } else {
                System.out.println(playerOneHand.getName() + " busted! " + playerTwoHand.getName() + " wins!");
            }
        } // if player two is greater than player one and if player two's card count is less than or equal to 21
        else if (playerOneHand.getValue() < playerTwoHand.getValue()) {
            if (playerTwoHand.getValue() <= 21) {
                System.out.println(playerTwoHand.getName() + " wins the game!");
            }  else {
                System.out.println(playerTwoHand.getName() + " busted! " + playerOneHand.getName() + " wins!");
            }
        } // else if both player one and player two's card count is greater than 21 then both bust
        else {
            if (playerOneHand.getValue() > 21 && playerTwoHand.getValue() > 21){
                System.out.println("Both players busted!");
            } else { // or if players have matching card count players tie
                System.out.println("Both players tied, no one wins!");
            }
        }

    }
}