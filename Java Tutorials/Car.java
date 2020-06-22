/**
 * Car
 */
public class Car implements VehicleInterface{
    
    private int gear = 0;
    private int speed = 0;

    public void changeGear(int gear){
        this.gear = gear;
    };
    public void speedUp(int change){
        this.speed += change;
    };
    public void slowDown(int change){
        this.speed -= change;
    };

    public void display(){
        System.out.println("The car is going at " + this.speed + "km/h and I am in gear " + this.gear);
        out();
    }
}