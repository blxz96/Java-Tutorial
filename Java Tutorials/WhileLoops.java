import java.util.Scanner;

/**
 * WhileLoops
 */
public class WhileLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int count = 0;

        do{
            System.out.print("Type a number: ");
            x = sc.nextInt();
            count++;
            
        }while(x!=10);

        System.out.println("You tried " + count + " times");

        sc.close();
    }
}