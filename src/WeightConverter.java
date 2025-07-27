import java.util.*;
public class WeightConverter {
    public static void main(String[] args) {

        // This program converts between lbs and kilograms.
        System.out.println("Welcome to the Weight Converter! \n 1. Convert lbs to Kilograms \n 2. Convert Kilograms to lbs");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option (1 or 2):");
        int option = sc.nextInt();

        if(option == 1) {
            System.out.println("Enter weight in lbs:");
            double lbs = sc.nextDouble();
            double kilograms = lbs * 0.453592;
            System.out.printf("%.2f lbs is equal to %.2f kilograms.\n", lbs, kilograms);
        } else if(option == 2) {
            System.out.println("Enter weight in kilograms:");
            double kilograms = sc.nextDouble();
            double lbs = kilograms / 0.453592;
            System.out.printf("%.2f kilograms is equal to %.2f lbs.\n", kilograms, lbs);
        } else {
            System.out.println("Invalid option selected.");
        }
        sc.close();
    }
}
