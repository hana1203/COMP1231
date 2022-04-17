package array.p7;

public class DeckOfCards {
    private Card[] deckOfCards;

    public DeckOfCards() {
        deckOfCards = new Card[52];
//        numOfSuit = deckOfCards[0].getSuit(); //suit 정보가져오려고 4개
//        numOfFace= deckOfCards[0].getFace(); //face 정보 13개
        // nullPointer 에러남

        Card card = new Card(); //랜덤 suit, face 정보의 카드 한장 가져오는것
//        System.out.println(card.getNumOfSuit()); //4
//        System.out.println(card.getNumOfFace()); //13

        //Load each card object in the DeckOfCards array
        /*
        for(int i=1; i<card.getNumOfSuit()+1; i++)
            for(int j=1; j<card.getNumOfFace()+1; j++) {
                deckOfCards[i*j] = new Card(i,j);
                System.out.println(deckOfCards[i*j]); //4*13=52
                }
         */
        //배열은 52개의 카드 deckOfCard[0] 부터 deckOfCard[51] 까지 담는것
        //이렇게 돌리면 마지막 for loop 에서 deckOfCards[52] 가 되기때문에 마지막 Card(4,13)인 King of spades 못담고 ArrayIndexOutOfBounds 에러남
        int k=0;
        for(int i=1; i<card.getNumOfSuit()+1; i++)
            for(int j=1; j<card.getNumOfFace()+1; j++) {
                deckOfCards[k] = new Card(i,j);
                System.out.println(deckOfCards[k]);
                k++;
            }

//        public Card shuffle() {
//                int randomNum = (int)Math.random()*53;
//        }

    }

    public static void main(String[] args) {
        DeckOfCards newtry = new DeckOfCards();
        System.out.println(newtry);
    }





}
//http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/10/deck-of-cards.html