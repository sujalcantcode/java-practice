import java.util.*;
public class NumGuesser {
    public static void main(String[] args) {
        // Number Guesser Game
        System.out.println("Welcome to the Number Guesser Game!");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int num = random.nextInt(100) + 1; // Random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;

        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        while (userGuess != num && attempts < 5) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess < num) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > num) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.printf("Congratulations! You've guessed the number %d in %d attempts.\n", num, attempts);
            }
        }

        if (attempts == 5) {
            System.out.printf("Sorry! You've used all your attempts. The number was %d.\n", num);
        }

        sc.close();
    }
}
