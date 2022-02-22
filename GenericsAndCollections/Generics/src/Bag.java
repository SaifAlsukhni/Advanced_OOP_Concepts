import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {
    ArrayList<T> objects;
    public Bag(){
        // Initialize the objects variable
        objects = new ArrayList<T>();
    }
    //class that inherits from Exception and throws
    public void add (T object) throws BagException {
        if (object == null)
            throw new BagException("Cannot add null to a Bag");
        objects.add(object);
    }
    //drawOne method here
    public T drawOne() {
        Random random = new Random();
        return (objects.get(random.nextInt(objects.size())));
    }

    public ArrayList<T> drawMany(int howMany){
    // howMany is the number of elements to draw.
    // Create an ArrayList of the generic type and "drawOne" as
    // many times as you need, putting the element drawn in the ArrayList. Then return it.
        ArrayList<T> elementsDraw = new ArrayList<T>(howMany);
        for (int i = 0; i <= howMany; i++){
            elementsDraw.add(drawOne());
        }
        return elementsDraw;
    }

    public void add(T element,double prob) throws BagException{
        // Check that the probability is between 0 and 1. Otherwise, throw an exception.
        // This is a way to add elements in a given proportion.
        if (!(prob >= 0) || !(prob <= 1))
            throw new BagException("Probability should be between 0 and 1");
        int tot = (int)Math.round(objects.size()*prob);
        for(int i=0;i<tot;i++){
            System.out.println("Adding "+i);
            objects.add(element);
        }
    }
}
