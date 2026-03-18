import java.io.IOException;

public class ThrowsAndThrowExample {

    // Method using throws clause to declare an IOException
    public void readFile() throws IOException {
        // Simulating an IOException
        throw new IOException("File not found");
    }

    // Method that uses throw to throw an exception based on a condition
    public void checkNumber(int number) {
        if (number < 0) {
            // Throw IllegalArgumentException if the number is negative
            throw new IllegalArgumentException("Number should be positive");
        } else {
            System.out.println("Number is positive");
        }
    }

    public static void main(String[] args) {
        ThrowsAndThrowExample example = new ThrowsAndThrowExample();

        // Handling IOException using try-catch block
        try {
            example.readFile();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }

        // Handling IllegalArgumentException
        example.checkNumber(-5); // This will throw IllegalArgumentException
    }
}
