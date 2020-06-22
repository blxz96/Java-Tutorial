/**
 * ComparingObjects
 */
public class ComparingObjects {

    public static void main(String[] args) {
        Student joe = new Student("Joe");
        Student bill = new Student("Bill");
        
        System.out.println("===Testing the equals method we wrote===");
        System.out.println(bill.equals(joe));

        System.out.println("===Testing compareTo in Comparable===");
        System.out.println(bill.compareTo(joe));//-8 because b is 8 letters before j
        System.out.println(bill.compareTo(joe)>0); //bill is not greater than joe

        System.out.println("===Testing: what will show if we print out object===");
        System.out.println(bill); // will show the memory location of the object if we never overwrite in toString method

    }
}