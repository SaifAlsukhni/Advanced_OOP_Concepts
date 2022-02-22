import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    public Deck() {
        /* TODO
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may help you.*/
        deck = new LinkedList<>();
        for(String s: suits) {
            deck.add(new Card<String, String>("Ace", s));
            deck.add(new Card<String, String>("Jack", s));
            deck.add(new Card<String, String>("Queen", s));
            deck.add(new Card<String, String>("King", s));
            //values for non-face cards
            for (int i = 2; i <= 10; i++)
                deck.add(new Card<Integer, String>(i, s));
       }
    }

    public Card dealCard(){
/* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */
        Random random = new Random();
        return (deck.remove(random.nextInt(deck.size())));
    }

    public int size(){/* TODO: Return the size of the deck (number of cards left in it)*/
        return deck.size();
    }
    @Override
    public Iterator<Card> iterator() {
       /* TODO 
Return a new DeckIterator with this instance in the constructor.*/
        return new DeckIterator<Card>(this);
    }
}
