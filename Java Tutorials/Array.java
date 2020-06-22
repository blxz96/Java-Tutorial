/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        //all values in an array is of the same type
        
        //Static Array
        String [] stringArr = new String[5];

        stringArr[0] = "hello";
        stringArr[1] = "hi";
        stringArr[2] = "time";
        stringArr[3] = "joe";
        stringArr[4] = "craze";

        String str = stringArr[4];
        System.out.println(str);

        int [] intArr = {2,3,4,5,6};
        int num = intArr[4];
        System.out.println(num);
    }
}