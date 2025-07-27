import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int response = input < 0 ? 0 : input; // Ensure count is non-negative

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response; // Initialize countdown from user input
            @Override
            public void run() {
                if (count > 0) {
                    System.out.println(count);
                    count--;
                } else {
                    System.out.println("Countdown finished!");
                    timer.cancel(); // Stop the timer when countdown is complete
                    sc.close(); // Close the scanner
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
