package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Hand {
    private ArrayList<Card> cards;

    static Scanner playerName = new Scanner(System.in);

    private String name;

    public Hand() {
        cards = new ArrayList<>();
    }

    // A Card is dealt to the Hand and the Hand is responsible // to store the card
    public void deal(Card card) {
        cards.add(card);
    }

    public int getSize() {
        return cards.size();
    }

    // The Hand uses the methods of each card to determine // the value of each card - and adds up all values
    public int getValue() {
        int value = 0;
        for (Card card : cards) {
            card.flip(); // turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }
        return value;
    }

    // prompts user for player names
    public void newPlayer() {
        System.out.print("Please enter Player's name: ");
        this.name = playerName.nextLine().trim();
    }

    // gets user's name to display
    public String getName(){
        return this.name;
    }
}
