import java.util.Random;
import java.util.Scanner;
public class DiceRoll {
    public static void main(String[] args) {
        // Dice Rolling Game
        System.out.println("Welcome to the Dice Rolling Game!");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of dice to roll: ");
        int numDice = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= numDice; i++) {
            int roll = random.nextInt(6) + 1; // Roll a die (1-6)
            total += roll;
            // Print the result of each die roll
            printDie(roll);
            System.out.printf("Die %d rolled: %d\n", i, roll);
        }

        System.out.printf("Total rolled: %d\n", total);
        sc.close();
    }

    static void printDie(int num) {
        String die1 = """
                    +---------+
                    |         |
                    |    ●    |
                    |         |
                    +---------+""";

        String die2 = """
                    +---------+
                    | ●       |
                    |         |
                    |       ● |
                    +---------+""";

        String die3 = """
                    +---------+
                    | ●       |
                    |    ●    |
                    |       ● |
                    +---------+""";

        String die4 = """
                    +---------+
                    | ●     ● |
                    |         |
                    | ●     ● |
                    +---------+""";

        String die5 = """
                    +---------+
                    | ●     ● |
                    |    ●    |
                    | ●     ● |
                    +---------+""";

        String die6 = """
                    +---------+
                    | ●     ● |
                    | ●     ● |
                    | ●     ● |
                    +---------+""";
        switch (num) {
            case 1 -> System.out.println(die1);
            case 2 -> System.out.println(die2);
            case 3 -> System.out.println(die3);
            case 4 -> System.out.println(die4);
            case 5 -> System.out.println(die5);
            case 6 -> System.out.println(die6);
            default -> System.out.println("Invalid die number.");
        }
    }

}
