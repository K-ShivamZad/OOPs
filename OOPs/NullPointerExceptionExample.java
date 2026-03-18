public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String str = null;
            // Attempting to access a method or property of a null object
            int length = str.length(); // This line will throw a NullPointerException
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
            // Perform actions to handle the exception gracefully
        }
    }
}
