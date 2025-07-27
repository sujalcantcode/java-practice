import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        // Temperature Converter
        System.out.println("Welcome to the Temperature Converter!");
        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();
        // Validate user choice
        while (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please select 1 or 2:");
            choice = sc.nextInt();
        }
        System.out.println("Enter the temperature to convert:");
        double temp = sc.nextDouble();
        double convertedTemp;
        // Perform conversion based on user choice
        convertedTemp = (choice == 1) ? (temp * 9/5) + 32 : (temp - 32) * 5/9;

        String unit = (choice == 1) ? "F" : "C";
        // Display the converted temperature
        System.out.printf("Converted temperature: %.2f °%s\n", convertedTemp, unit);

        sc.close();
    }
}


