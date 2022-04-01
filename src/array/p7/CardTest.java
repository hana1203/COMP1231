package array.p7;

public class CardTest {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        Card card4 = new Card();
        Card card5 = new Card();
//        System.out.println(card1);
//        System.out.println(card2);
//        System.out.println(card3);
//        System.out.println(card4);
//        System.out.println(card5);

        Card card6 = new Card(4, 13);
        Card card7 = new Card(1,1);
        Card card8 = new Card(3, 15); //invalid face of hearts
        Card card9 = new Card(9, 1); //Ace of invalid suit
        System.out.println(card6);
        System.out.println(card7);
        System.out.println(card8);
        System.out.println(card9);

    }
}
