import java.util.Arrays;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();
         if (n <= 0 || n > 1000) {
             System.out.println("Invalid input");
             return;
         }
       int[] nums = new int[n];
         for (int i = 0; i < n; i++) {
              nums[i] = sc.nextInt();
              sc.nextLine();
              if (nums[i] <= -1000000 || nums[i] >= 1000000) {
                    System.out.println("Invalid input");
                    return;
                }
         }
         int[] runningSum = new int[n];
         for (int i = 0; i < n; i++) {
             if (i == 0) {
                 runningSum[i] = nums[i];
             }
             else {
                 runningSum[i] = runningSum[i - 1] + nums[i];
             }
         }
         System.out.println(Arrays.toString(runningSum));

         sc.close();
    }
}