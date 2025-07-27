import java.util.*;
public class Bank {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Bank Management System
        System.out.println("Welcome to the Bank Management System!");
        System.out.println("Please select an option:");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");

        int choice;
        double balance = 10.00; // Initial balance

        do {
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> { 
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    balance += depositAmount;
                    deposit(depositAmount, balance);
                }
                case 3 -> { 
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds for this withdrawal.");
                    } else {
                        balance -= withdrawAmount;
                        withdraw(withdrawAmount, balance);
                    }
                }
                case 4 -> checkBalance(balance);
                case 5 -> System.out.println("Exiting the system. Thank you!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
}
        static void createAccount() {
            System.out.println("Account created successfully!");
            // Logic to create an account can be added here
        }
        static void deposit(double amount, double balance) {
            if (amount > 0) {
                System.out.printf("Deposited: $%.2f. New balance: $%.2f\n", amount, balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
        static void withdraw(double amount, double balance) {
            if (amount > 0 && amount <= balance) {
                System.out.printf("Withdrew: $%.2f. New balance: $%.2f\n", amount, balance);
            } else if (amount > balance) {
                System.out.println("Insufficient funds for this withdrawal.");
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }
        static void checkBalance(double balance) {
            System.out.printf("Current balance: $%.2f\n", balance);
}
}
