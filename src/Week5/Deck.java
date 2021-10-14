package Week5;


import java.security.SecureRandom;

public class Deck {

    Card deck[]=new Card[52];

    String suits[]={"Spades","Clubs","Hearts","Diamonds"};
    String ranks[]={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};




    Deck(){
        int counter=0;
        for(int j=0;j<4;j++) {
            for (int i = 0; i < 13; i++)
                deck[counter++] = new Card(ranks[i], suits[j]);
        }

    }


    public void displaDeck(){
        for(Card temp: deck)
            temp.display();
    }

    public void shuffleCards(int randomCount){
        SecureRandom random = new SecureRandom();

        int temp= random.nextInt(52);

        Card tempCard= new Card("","");

        for(int i=0;i<randomCount;i++) {
            temp= random.nextInt(52);
            tempCard = deck[0];

            deck[0] = deck[temp];

            deck[temp] = tempCard;
        }

    }


    public Card peekCard(){
        return deck[deck.length-1];
    }
}
