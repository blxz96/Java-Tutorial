import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Lists
 */
public class Lists {

    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        // to add element
        t.add(1);
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        // to retrieve via the index
        t.get(0);
        // to set the element at index (must already exist)
        t.set(4,10);
        // to get the size of the list
        t.size();
        // to get from a range in the list not including the ending index
        t.subList(2, 4);

        System.out.println(t);
        System.out.println(t.size());
        System.out.println(t.subList(2, 4));

        // Faster than ArrayList
        LinkedList<Integer> l = new LinkedList<Integer>();
        // to add element
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        // to retrieve via the index
        l.get(0);
        // to set the element at index (must already exist)
        l.set(4,10);
        // to get the size of the list
        l.size();
        // to get from a range in the list not including the ending index
        l.subList(2, 4);

        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.subList(2, 4));

    }
}