package array.p7;
/*
Design and implement a class called Card that represents a standard playing card.
Each card has a suit and a face value. Create a program that deals five random cards.
A standard 52-card deck comprises 13 ranks in each of the four French suits
: clubs (♣), diamonds (♦), hearts (♥), and spades (♠)
4개 suits 는 각각 1-13 까지의 값 가지고있음. 1-10, Jack, Queen, King

hint:
Represent the faces/ranks of Ace through King as 1 through 13 and the suits as 1 through 4.
You need two constructors: one that receives a face/rank value and suit value as parameters,
plus the default constructor where these values are randomly generated.


The programming projects of Chapter 5 discussed a Card class that represents a standard playing card.
Create a class called DeckOfCards that stores 52 objects of the Card class.
Include methods to shuffle the deck, deal a card, and report the number of cards left in the deck.
The shuffle method should assume a full deck.
Create a driver class with a main method that deals each card from a shuffled deck, printing each card as it is dealt.
 */

import java.util.Random;
public class Card {
    private int suit;
    private int face;
    public Card() {
        Random rand = new Random();
        suit = rand.nextInt(4)+1; //1~4
        face = rand.nextInt(13)+1; //1~13
    }

    public Card(int suit, int face) {
        this.suit = suit;
        this.face = face;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getFace() {
        return face;
    }

    public void setFace(int face) {
        this.face = face;
    }

    public String toString() {
        String suitStr;
        switch (suit) {
            case 1: suitStr = "clubs";
            break;
            case 2: suitStr = "diamonds";
            break;
            case 3: suitStr = "hearts";
            break;
            case 4: suitStr = "spades";
            break;
            default: suitStr = "invalid suit";
            break;
        }
        String faceStr;
//        if (face == 1) {
//            faceStr = "Ace";
//        }
//        else if (face == 11) {
//            faceStr = "Jack";
//        }
//        else if (face == 12) {
//            faceStr = "Queen";
//        }
//        else if (face == 13) {
//            faceStr = "King";
//        }

        switch (face) {
            case 1: faceStr = "Ace";
            break;
            case 2: faceStr = "two";
            break;
            case 3: faceStr = "three";
            break;
            case 4: faceStr = "four";
            break;
            case 5: faceStr = "five";
            break;
            case 6: faceStr = "six";
                break;
            case 7: faceStr = "seven";
                break;
            case 8: faceStr = "eight";
                break;
            case 9: faceStr = "nine";
                break;
            case 10: faceStr = "ten";
                break;
            case 11: faceStr = "Jack";
                break;
            case 12: faceStr = "Queen";
                break;
            case 13: faceStr = "King";
                break;
            default: faceStr = "invalid face";
                break;
        }
        return faceStr + " of " + suitStr;
    }

}
