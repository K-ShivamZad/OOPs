public class AdditionOfNumbers {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as command line arguments.");
            return;
        }

        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);

            int sum = number1 + number2;
            System.out.println("Sum of " + number1 + " and " + number2 + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integer numbers as command line arguments.");
        }
    }
}
