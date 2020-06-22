/**
 * For_loops
 */
public class For_loops {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9,10};

        // To iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9){
                System.out.println("Found a 9 at index " + i);
            }
        }
    }
}