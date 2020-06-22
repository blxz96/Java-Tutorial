/**
 * OuterClass
 */
public class OuterClass {

    // Private Inner Class
    private class PrivateInnerClass { // can only access this class within this OuterClass since private
        public void display() {
            System.out.println("This is a private inner class.");
        }   
    }
    public void inner() {
        PrivateInnerClass in = new PrivateInnerClass();
        in.display();
    }

    // Public Inner Class
    public class PublicInnerClass{
        public void display2(){
            System.out.println("This is a public inner class");
        }
    }
    public void inner2() {
        PublicInnerClass in = new PublicInnerClass();
        in.display2();
    }

    // Class within method
    public void inner3() {
        class InnerClass{
            public void display() {
                System.out.println("Inner Class within method.");
            }
        }
        InnerClass in = new InnerClass();
        in.display();
        
    }

    


    
}