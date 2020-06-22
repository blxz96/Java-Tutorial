/**
 * Conditions
 */
import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("Tim")){
            System.out.println("You type Tim");
        }
        else if(!s.equals("Tim")){
            System.out.println("You did not type Tim");
        }
        System.out.println("End");

        sc.close();

    }
}