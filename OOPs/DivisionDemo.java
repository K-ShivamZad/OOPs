class DivideByEightException extends Exception 
{
    public DivideByEightException() 
    {
        super("Custom Exception: Division by 8 is not allowed.");
    }
}

public class DivisionDemo {
    public static void main(String[] args) 
    {
        int numerator = 16;
        int denominator = 8;

        try {
            if (denominator == 8) 
            {
                throw new DivideByEightException(); // Throwing the custom exception
            }
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (DivideByEightException e) 
        {
            System.err.println(e.getMessage()); // Handling the custom exception
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: Division by zero or other arithmetic errors.");
        }
    }
}
