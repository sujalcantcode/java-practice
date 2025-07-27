import java.util.Random;
import java.util.Scanner;
public class SlotMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        double balance = 100.0; // Starting balance
        double bet = 0.0; // Bet amount

        String[] symbols = {"🍒", "🍋", "🍊", "🍉", "🍇"}; // Slot machine symbols
        String[] results = new String[3]; 

        boolean playAgain = true;
        while (playAgain) {
            // Display the current balance
            if (balance <= 0) {
                System.out.println("You have run out of money! Game over.");
                break;
            }
            if (balance > 1000) {
                System.out.println("Congratulations! You have won the jackpot!");
                break;
            }
            System.out.println();
            System.out.println("===================================");
            System.out.println("Welcome to the Slot Machine!");
            System.out.println("===================================");
            System.out.println();
            System.out.printf("Your current balance is: $%.2f%n", balance);
            
            // Ask the player for a bet
            System.out.print("Enter your bet amount: ");
            // Check if the input is a valid double
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid bet amount.");
                sc.next(); // Clear the invalid input
                System.out.print("Enter your bet amount: ");
            }
            bet = sc.nextDouble();
            // Validate the bet amount
            if (bet <= 0 || bet > balance) {
                System.out.println("Invalid bet amount. Please enter a valid bet.");
                continue;
            }

            // Spin the slot machine
            System.out.println("Spinning the slot machine...");
            try {
                Thread.sleep(2000); // Simulate spinning delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < results.length; i++) {
                results[i] = symbols[random.nextInt(symbols.length)];
            }
            
            // Show the results
            System.out.println("Results: ");
            System.out.println("-------------");
            System.out.println("      " + results[0] + " | " + results[1] + " | " + results[2]);
            System.out.println("-------------");

            // Check for a win
            if (results[0].equals(results[1]) && results[1].equals(results[2])) {
                System.out.printf("Congratulations! You win $%.2f!%n", (bet * 10));
                balance += bet * 10; // Win 10 times the bet
            } else if (results[0].equals(results[1]) || results[1].equals(results[2]) || results[0].equals(results[2])) {
                System.out.printf("You win $%.2f!%n", (bet * 2));
                balance += bet * 2; // Win 2 times the bet
            } else {
                System.out.printf("Sorry, you lose your bet of $%.2f.%n", bet);
                balance -= bet; // Lose the bet
            }
            
            // Display the updated balance
            System.out.printf("Your updated balance is: $%.2f%n", balance);
            
            // Ask if the player wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Your final balance is: $" + balance);
        sc.close();
    }
}

