public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobby", 3);
        dog.speak();
        Dog dog2 = new Dog("Blackie", 4);
        dog2.speak();
        Dog dog3 = new Dog("Browny", 5);
        dog3.speak();
        
        System.out.println("===Testing getters and setters===");
        System.out.println(dog.getAge());
        dog.setAge(7);
        dog.speak();

        System.out.println("===Testing private method===");
        Dog dog4 = new Dog("Billy", 10, true);
        dog4.speak();

        System.out.println("===Testing Inheritance Husky class===");
        Dog dog5 = new Husky("Husk", 15, "Alaska");
        dog5.speak();

        System.out.println("===Testing of static(class) variable ===");
        System.out.println("Dog count = " + Dog.count);

        System.out.println("===Testing of static(class) method ===");
        Dog.display();

    }
}