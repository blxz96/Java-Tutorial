import java.util.Arrays;

/**
 * Sorting
 */
public class Sorting {

    public static void main(String[] args) {
        int[] x = {-43,87,5,32,54,7,32,65};
        // Sorting array from index to index(not inclusive)
        Arrays.sort(x, 0, 3);
        for (int i : x) {
            System.out.print(i+ " ");
        }
        System.out.println();
        // Sorting entire array
        Arrays.sort(x);
        for (int i : x) {
            System.out.print(i+ " ");
        }
        
    }
}