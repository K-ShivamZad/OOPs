// Defining an abstract class
abstract class Vehicle {
    // Abstract method
    abstract void start();
    
    // Concrete method
    void fuel() {
        System.out.println("Fueling the vehicle.");
    }
}

// Subclass implementing the abstract class
class Car extends Vehicle {
    // Implementing the abstract method
    @Override
    void start() {
        System.out.println("The car starts with a key.");
    }
}

// Main class to test the implementation
public class Labmn2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Using the abstract class type for flexibility
        myCar.start();  // Call the implemented abstract method
        myCar.fuel();   // Call the concrete method from the abstract class
    }
}
