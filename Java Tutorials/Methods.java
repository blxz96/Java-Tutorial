/**
 * Methods
 */
public class Methods {

    public static void main(String[] args) {
        printName("Bryan", 3);
        System.out.println(addition(1, 2));
        System.out.println(str_exclaimation("Hello"));
    }

    public static void printName(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static int addition(int x,int y) {
        return x+y;
    }

    public static String str_exclaimation(String x) {
        return x + "!";
    }
}