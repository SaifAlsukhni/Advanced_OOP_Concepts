import java.util.HashMap;
import java.util.Set;

public class Counter<E> {
    /* TODO
The HashMap should accomodate a generic class for the keys and Integer for the value*/
    private HashMap<E, Integer> counts;

    public Counter(E[] things) {
/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */
        counts = new HashMap<>();
        for (E thing: things) {
            if (counts.containsKey(thing)) {
                counts.put(thing, counts.get(thing) + 1);
            } else {
                counts.put(thing, 1);
            }
        }
    }

    public Integer getCount(E element){
      /* TODO
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */;
            return counts.get(element);
    }

    public int getSize () {
        return this.counts.size();
    }

    public E mostFrequent () { /* TODO
Returns the most frequent key in the HashMap*/
        int count = 0;
        Set<E> keys = counts.keySet();
        E element = null;

        for (E k : keys) {
            if (counts.get(k) > count) {
                count = counts.get(k);
                element = k;
            }
        }
        return element;
    }
}

