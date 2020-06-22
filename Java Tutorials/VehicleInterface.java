/**
 * Vehicle Interface
 */
public interface VehicleInterface {
    final int gears = 5;

    void changeGear(int a);
    void speedUp(int a);
    void slowDown(int a);

    default void out(){
        System.out.println("Default method");
    }

    //can also have static method just like in maths class
    
    
}