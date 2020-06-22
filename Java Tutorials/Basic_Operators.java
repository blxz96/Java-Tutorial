/**
 * Basic_Operators
 */
public class Basic_Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 3;

        int sum = a + b + c;
        int diff = a - b - c;
        int div = a / (b+c);
        double div2 = a/c;
        double div3 = a/(double)c;
        int mul = a * b * c;
        int rem = a % 3;
        int exp = (int) Math.pow(a, b);

        System.out.println("Sum:"+ sum);
        System.out.println("Diff:" + diff);
        System.out.println("Div:" + div);
        System.out.println("Div2:" + div2);
        System.out.println("Div3:" + div3);
        System.out.println("Mul:" + mul);
        System.out.println("Rem:" + rem);
        System.out.println("Exp:" + exp);
    }
}