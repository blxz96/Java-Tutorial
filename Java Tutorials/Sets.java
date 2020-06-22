import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Sets
 */
public class Sets {

    public static void main(String[] args) {
        Set<Integer> t = new HashSet<Integer>();
        
        // To add element into the set
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);

        // To remove element from the set
        t.remove(9);

        // To clear everything
        t.clear();

        // to check if set contains an element
        boolean x = t.contains(5);

        // To check if a set is empty
        t.isEmpty();

        // To check the size of a set
        t.size();

        System.out.println(t);
        System.out.println(x);
        System.out.println(t.isEmpty());
        System.out.println(t.size());

        // Similar to HashSet, be TreeSet will give us ordered set
        Set<Integer> s = new TreeSet <Integer>();
        // To add element into the set
        s.add(5);
        s.add(-7);
        s.add(5);
        s.add(9);

        System.out.println(s);

        // Similar to HashSet but fastened the operations
        Set<Integer> l = new LinkedHashSet <Integer>();
        // To add element into the set
        l.add(5);
        l.add(-7);
        l.add(5);
        l.add(9);

        System.out.println(l);

    }
}