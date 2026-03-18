import java.util.Scanner;

import BCA.BCABOY;
import BCA.BCAGIRL;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'Boy' or 'Girl': ");
        String input = scanner.nextLine().toLowerCase(); // Using method chaining to convert input to lowercase

        // Using switch expression introduced in Java 12
        switch (input) {
            case "boy" -> {
                BCABOY boy = new BCABOY();
                boy.resultOut();
            }
            case "girl" -> {
                BCAGIRL girl = new BCAGIRL();
                girl.resultOut();
            }
            default -> System.out.println("You have Failed in the Exam"); // Using simplified switch statement
        }
    }
}
