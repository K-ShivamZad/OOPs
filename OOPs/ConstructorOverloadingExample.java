public class ConstructorOverloadingExample {
    private int value;

    // Default constructor
    public ConstructorOverloadingExample() {
        this.value = 0; // Set default value
    }

    // Constructor with one parameter
    public ConstructorOverloadingExample(int value) {
        this.value = value;
    }

    // Constructor with two parameters
    public ConstructorOverloadingExample(int value1, int value2) {
        this.value = value1 + value2;
    }

    // Method to display the value
    public void displayValue() {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample(); // Invokes default constructor
        ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample(5); // Invokes constructor with one parameter
        ConstructorOverloadingExample obj3 = new ConstructorOverloadingExample(3, 7); // Invokes constructor with two parameters

        obj1.displayValue(); // Output: Value: 0
        obj2.displayValue(); // Output: Value: 5
        obj3.displayValue(); // Output: Value: 10
    }
}
