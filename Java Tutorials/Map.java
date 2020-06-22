import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Map
 */
public class Map {

    public static void main(String[] args) {
        
        // HashMap m = new HashMap(); if don't want to specify Generics
        System.out.println("===HashMap===");
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        // Key value pair. Key must be unique or it will be replaced. Does not care about order.
        m.put("Tim",5);
        m.put("Joe",6);
        m.put("Bob",7);
        m.put("Bob",8);
        // print out the Hashmap
        System.out.println(m);
        // Retrieving via Key
        System.out.println(m.get("Tim"));
        // check if map contains key
        System.out.println(m.containsKey("Tim"));
        // check if map contains value
        System.out.println(m.containsValue(6));
        // get all keys
        System.out.println(m.keySet());
        // get all values
        System.out.println(m.values());
        // clear all items in map
        m.clear();
        // check if map is empty
        System.out.println(m.isEmpty());



        System.out.println("===TreeMap===");
        // In Tree Map, key will be in sorted order
        TreeMap<String, Integer> t = new TreeMap<String, Integer>();
        // Key value pair. Key must be unique or it will be replaced. 
        t.put("Tim",5);
        t.put("Joe",6);
        t.put("Bob",7);
        t.put("Bob",8);
        // print out the Treemap
        System.out.println(t);
        // Retrieving via Key
        System.out.println(t.get("Tim"));
        // check if map contains key
        System.out.println(t.containsKey("Tim"));
        // check if map contains value
        System.out.println(t.containsValue(6));
        // get all keys
        System.out.println(t.keySet());
        // get all values
        System.out.println(t.values());
        // clear all items in map
        t.clear();
        // check if map is empty
        System.out.println(t.isEmpty());


        System.out.println("===LinkedHashMap===");
        // In LinkedHashMap, map will be in the same order, the key is added
        LinkedHashMap<String, Integer> l = new LinkedHashMap<String, Integer>();
        // Key value pair. Key must be unique or it will be replaced. 
        l.put("Tim",5);
        l.put("Joe",6);
        l.put("Bob",7);
        l.put("Bob",8);
        // print out the LinkedHashMap
        System.out.println(l);
        // Retrieving via Key
        System.out.println(l.get("Tim"));
        // check if map contains key
        System.out.println(l.containsKey("Tim"));
        // check if map contains value
        System.out.println(l.containsValue(6));
        // get all keys
        System.out.println(l.keySet());
        // get all values
        System.out.println(l.values());
        // clear all items in map
        l.clear();
        // check if map is empty
        System.out.println(l.isEmpty());


        System.out.println("===Some examples===");
        // Some examples
        HashMap<Character, Integer> k = new HashMap<Character,Integer>();
        String str = "Hello, my name is Bryan.";
        for(char x: str.toCharArray()){
            if (k.containsKey(x)){
                int old = k.get(x);
                k.put(x,old+1);
            }
            else{
                k.put(x,1);
            }
        }
        System.out.println(k);
    }

    
    

}