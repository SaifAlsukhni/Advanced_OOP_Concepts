import java.util.Iterator;

public class DeckIterator<E> implements Iterator<E> {
    Deck d;
    public DeckIterator(Deck d){
/* TODO
initialize the variable d */
    this.d = d;
    }

    @Override
    public boolean hasNext() {
       /* TODO
Return true if there are elements left in the Deck */
        return (d.size() > 0);
    }

    @Override
    public E next() {
        /* TODO
Deal a card and return it. */
        return (E) d.dealCard();
    }
}
