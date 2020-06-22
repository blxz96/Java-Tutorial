import java.util.Scanner;
/**
 * ForEachLoops
 */
public class ForEachLoops {

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        
        int count = 0;
        for (int i : arr) {
            System.out.println(i +" "+count);
            count ++;
        }

        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        
        for (int i = 0; i < names.length; i++) {
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
        }

        for (String n : names) {
            System.out.println(n);
            if (n.equals("time")){
                break;
            }
        }

        sc.close();

    }
}