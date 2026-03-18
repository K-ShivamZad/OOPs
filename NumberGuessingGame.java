import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100) + 1; // Ensure number is between 1 and 100
        int userNumber;

        do {
            System.out.println("Guess my number (1-100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO .. CORRECT NUMBER!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too small");
            }
        } while (userNumber != myNumber); // Continue until correct guess

        System.out.println("My number was: " + myNumber);
        sc.close(); // Close the scanner
    }
}
