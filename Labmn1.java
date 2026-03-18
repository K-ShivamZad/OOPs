// Defining an interface
interface Animal {
    // Abstract method
    void sound();

    // Default method
    default void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Implementing the interface in a class
class Dog implements Animal {
    // Implementing the abstract method
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Main class to test the implementation
public class Labmn1 {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Using the interface type for flexibility
        myDog.sound();  // Call the implemented method
        myDog.sleep();  // Call the default method from the interface
    }
}
