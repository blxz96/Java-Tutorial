/**
 * Husky Inheritance
 */
public class Husky extends Dog{

    private String location;

    public Husky(){
        super();
        this.location = "an unknown place";
    }

    public Husky(String name, int age){
        super(name,age);
        this.location = "an unknown place";
    }

    public Husky(String name, int age, boolean one_year_passed){
        super(name, age, one_year_passed);
        this.location = "an unknown place";
    }

    public Husky(String name, int age, String location){
        super(name, age);
        this.location = location;
    }

    public void speak() {
        super.speak();
        System.out.println("I am based in " + this.location + ".");
    }
    
}