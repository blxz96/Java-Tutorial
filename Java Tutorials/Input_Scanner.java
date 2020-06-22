/**
 * Input_Scanner
 */

import java.util.Scanner;

public class Input_Scanner {
    // Do not run this. This is just notes.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get a string from the user
        String scannedStr = sc.next();
        System.out.println(scannedStr);

        int scannedInt = sc.nextInt();
        System.out.println(scannedInt);

        boolean scannedBool = sc.nextBoolean();
        System.out.println(scannedBool);

        double scannedDouble = sc.nextDouble();
        System.out.println(scannedDouble);

        // How to get around the error if input wrong data type?
        String scanned = sc.next();
        int x = Integer.parseInt(scanned);
        // For condition, next tutorial


    }
}