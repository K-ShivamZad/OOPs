import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Expense {
    private String name;
    private double amount;
    private String category;

    public Expense(String name, double amount, String category) {
        this.name = name;
        this.amount = amount;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " - " + amount + " (" + category + ")";
    }
}

public class ExpenseTracker {
    private static List<Expense> expenses = new ArrayList<>();
    private static double totalExpenses = 0;
    private static final double budget = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueAddingExpenses = true;

        while (continueAddingExpenses) {
            System.out.println("Expense Tracker and Budget Analysis");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Budget Analysis");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1/2/3/4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addExpense(scanner);
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    viewBudgetAnalysis();
                    break;
                case 4:
                    continueAddingExpenses = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void addExpense(Scanner scanner) {
        System.out.print("Enter Expense Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Expense Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Expense Category: ");
        String category = scanner.nextLine();

        Expense expense = new Expense(name, amount, category);
        expenses.add(expense);
        totalExpenses += amount;
        System.out.println("Expense added successfully.");
    }

    private static void viewExpenses() {
        System.out.println("Expense List:");
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    private static void viewBudgetAnalysis() {
        System.out.println("Budget Analysis:");
        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Budget: " + budget);
        System.out.println("Budget Remaining: " + (budget - totalExpenses));
    }
}
