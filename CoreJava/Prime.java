import java.util.Scanner;
import static java.util.stream.IntStream.rangeClosed;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = false;
        if (n <= 1) {
            isPrime = false;
        } else {
            // Check if 'n' is not divisible by any number from 2 up to and including sqrt(n)
            // If none of these numbers divide 'n', then 'n' is prime
            isPrime = rangeClosed(2, (int)Math.floor(Math.sqrt(n)))
            .noneMatch(i -> n % i == 0);
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        sc.close();
    }
}
