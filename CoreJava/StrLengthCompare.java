import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class StrLengthCompare {
    public static void main(String[] args) {
        // String Length Comparison
        System.out.println("Welcome to the String Length Comparison!");
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        int n = 0;
        while (true) {
            System.out.print("Enter the number of strings to compare: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                sc.nextLine(); // Consume the newline character
        if (n > 0) {
            break;
        } else {
            System.out.println("Please enter a positive integer.");
        }
                System.out.println("Invalid input. Please enter a positive integer.");
                sc.nextLine(); // Consume the invalid input
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings.add(sc.nextLine());
        }
        Comparator<String> lengthComparator = Comparator.comparingInt(String::length);
        strings.sort(lengthComparator);
        System.out.println("Strings sorted by length:");
        for (String str : strings) {
            System.out.println(str);
        }
        sc.close();
    }
    
}
