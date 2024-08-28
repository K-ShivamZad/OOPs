public class FinallyBlockNotExecuted {
    public static void main(String[] args) {
        try {
            System.out.println("Try block executing...");
            // Exiting the program with System.exit()
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // This finally block will not be executed due to System.exit()
            System.out.println("Finally block executing...");
        }
    }
}
