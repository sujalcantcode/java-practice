import java.util.*;
public class CompoundInterest {
    public static void main(String[] args) {
        
        // Compound Interest Calculator
        System.out.println("Welcome to the Compound Interest Calculator!");
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the principal amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest in %:");
        double rate = sc.nextDouble()/ 100; // Convert percentage to decimal
        System.out.println("Enter the number of times interest is compounded per year:");
        int n = sc.nextInt();
        System.out.println("Enter the time (in years):");
        int time = sc.nextInt();

        // Calculate compound interest
        double amount = principal * Math.pow(1 + rate/n, n * time);
        double compoundInterest = amount - principal;

        // Display the results
        System.out.printf("\nThe amount after %d years is: $%.3f", time, amount);
        System.out.printf("\nThe compound interest earned is: $%.3f", compoundInterest);
        sc.close();
    }

}
