/**
 * Conditions_and_Boolean
 */

public class Boolean {

    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        String c = "hello";
        String d = "Hi";
        
        boolean compareInt = a > b; // Can use: > < == >= <= !=
        boolean compareStr = c == d; // Can use: s.equals
        boolean compareAnd = b > a && c.equals(d);
        boolean compareOr = b > a || c.equals(d);
        boolean compareNot = !(b>a && c.equals(d));

        System.out.println(compareInt);
        System.out.println(compareStr);
        System.out.println(compareAnd);
        System.out.println(compareOr);
        System.out.println(compareNot);
    }
}