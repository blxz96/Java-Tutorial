/**
 * Dog
 */
public class Dog {
    
    // static (class) variable. Doesn't care about instance.
    protected static int count = 0;

    // static (class) method. Doesn't care about instance.
    public static void display(){
        System.out.println("There are a total of " + Dog.count + " dogs created.");
    }

    //private attribute can only be used in this class
    //can be changed to protected for inheritance purpose
    protected String name;
    protected int age;

    //constructor
    public Dog() {
        this.name = "Doggo";
        this.age= 1;
        Dog.count++;
        // can actually use this.count since we are inside dog class.
        // but better to use Dog.count

    }
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        Dog.count++;

    }
    public Dog(String name, int age, boolean one_year_passed){
        this.name = name;
        this.age = age;
        Dog.count++;

        if (one_year_passed == true){
            ageOneYear();
        }
    }
    //public methods
    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old.");
    }
    //getter
    public int getAge() {
        return this.age;
    }
    //setter
    public void setAge(int age){
        this.age = age;
    }

    // private methods can only be see within this dog class
    private void ageOneYear() {
        this.age ++; 
    }
    

}