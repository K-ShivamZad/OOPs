public class ArthExec 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 0;

        try {
            a = a / b; // Division by zero (10/0)
            System.out.println("Don't print"); // This line won't be executed
        } catch (ArithmeticException e) 
        {
            System.out.println("Division by zero error");
            System.out.println("Please change the 'b' value");
        }

        System.out.println("Quit"); // This line will be executed regardless of the exception
    }
}
