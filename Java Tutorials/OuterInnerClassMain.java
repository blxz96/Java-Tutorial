/**
 * InnerOuterInnerClassMain
 */
public class OuterInnerClassMain {

    public static void main(String[] args) {
        
        System.out.println("===Testing private inner class===");
        OuterClass outer = new OuterClass();
        outer.inner();

        System.out.println("===Testing public inner class===");
        OuterClass outer2 = new OuterClass();
        outer2.inner2();

        System.out.println("===Testing public inner class here===");
        OuterClass outer3 = new OuterClass();
        OuterClass.PublicInnerClass in = outer3.new PublicInnerClass();
        in.display2();

        System.out.println("===Testing inner class within method===");
        OuterClass outer4 = new OuterClass();
        outer4.inner3();


    }
}