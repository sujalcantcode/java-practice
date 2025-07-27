import java.io.*;
import java.util.*;
public class Hangman {
    public static void main(String[] args) {
        // Hangman game implementation
        
        String filePath = "C:\\Users\\ASUS\\OneDrive\\ドキュメント\\git demo\\java demo\\Demo\\lib\\words.txt";
        ArrayList<String> words = new ArrayList<>();
        File wordFile = new File(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(wordFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Word file not found: " + filePath);           
        } catch (IOException e) {
            System.err.println("Error reading word file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));
        int attempts = 6; // Number of allowed incorrect attempts
        boolean playing = true;
        ArrayList<String> wordState = new ArrayList<>(Collections.nCopies(word.length(), "_"));
        System.out.println("*********************");
        System.out.println(" Welcome to Hangman!");
        System.out.println("*********************");

        System.out.println("Guess the word: " + String.join(" ", wordState));
        System.out.println("You have " + attempts + " attempts left.");
        while (playing) {
            try (Scanner sc = new Scanner(System.in)) {
                Set<Character> guessedLetters = new HashSet<>();
            while (attempts > 0) {
                System.out.print("Enter a letter: ");
                char input = sc.nextLine().toLowerCase().charAt(0);
                
                if (!Character.isLetter(input)) {
                    System.out.println("Please enter a valid letter.");
                    continue;
                }

                if (guessedLetters.contains(input)) {
                    System.out.println("You already guessed that letter. Try again.");
                    continue;
                }

                guessedLetters.add(input);

                if (word.indexOf(input) == -1) {
                    attempts--;
                    System.out.println("Incorrect guess! You have " + attempts + " attempts left.");
                } else {
                    System.out.println("Good guess!");
                }

                StringBuffer currentGuess = new StringBuffer();
                for (char c : word.toCharArray()) {
                    if (guessedLetters.contains(c)) {
                        currentGuess.append(c);
                    } else {
                        currentGuess.append(" _");
                    }
                }
                
                System.out.println("Current word: " + currentGuess);
                
                if (!currentGuess.toString().contains("_")) {
                    System.out.println("Congratulations! You've guessed the word: " + word);
                    return;
                }
                
            }
            System.out.println("Do you want to continue? (y/n): ");
                String response = sc.nextLine().toLowerCase();
                if (response.equals("n")) {
                    playing = false;
                }
            System.out.println("Game over! The word was: " + word);
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter a letter.");
        } catch (NoSuchElementException e) {
            System.err.println("No input provided. Exiting the game.");
        } catch (IllegalStateException e) {
            System.err.println("Scanner is closed. Cannot read input.");
        }catch (Exception e) {
            System.err.println("An error occurred during the game: " + e.getMessage());
        }
        System.out.println("Thank you for playing Hangman!");
        System.out.println("Exiting the game.");
    }
    }
}
