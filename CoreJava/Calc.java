import java.util.*;

public class Calc {
    public static void main(String[] args) {
        // Simple Calculator
        System.out.println("Welcome to the Simple Calculator!");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter operation (+, -, *, /):");
        char operation = sc.next().charAt(0);
        while (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("Invalid operation. Please enter +, -, *, or /:");
            operation = sc.next().charAt(0);
        }
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        double result;
        switch (operation) {
               case '+' -> result = num1 + num2;
               case '-' -> result = num1 - num2;
               case '*' -> result = num1 * num2;
               case '/' -> {
                   if (num2 == 0) {
                       System.out.println("Error: Division by zero is not allowed.");
                       sc.close();
                       return;
                   }
                   result = num1 / num2;
               }
               default -> result = 0; // This should never happen due to validation
        }
        System.out.printf("Result: %.5f\n", result);
        sc.close();
    }
}   