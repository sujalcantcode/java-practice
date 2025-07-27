import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What you would like to buy?");
        String item = sc.nextLine();
        System.out.println("What is the price of " + item + "?");
        double price = sc.nextDouble();
        System.out.println("How many " + item + "s would you like to buy?");
        int quantity = sc.nextInt();
        double totalCost = price * quantity;
        System.out.println("You have bought " + quantity + " " + item + "(s) at a price of $" + price + " each.");
        System.out.println("The total cost is: $" + totalCost);
        sc.close();
    }
}
