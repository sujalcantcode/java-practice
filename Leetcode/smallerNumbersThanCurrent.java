
import java.util.Arrays;
import java.util.HashMap;

public class smallerNumbersThanCurrent {
    // 1365. How Many Numbers Are Smaller Than the Current Number
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3}; // Example input
        int[] result = bruteForce(nums);
        System.out.println(nums.length + " numbers smaller than current:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    //Approach: Optimized
    public static int[] optimized(int[] nums) {
        int [] sorted = nums.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<sorted.length;i++){
            map.putIfAbsent(sorted[i],i);
        }
        int n = nums.length;
        int [] result = new int[n];
        for(int i = 0;i<n;i++){
            result[i] = map.get(nums[i]);
        }
        return result;


    }
    // Approach: Brute Force
    public static int[] bruteForce(int[] nums) {
        int n = nums.length;
        int[] smallerNos = new int[n];
        for(int i = 0;i < n;i++){
            int count = 0;
            for(int j = 0;j < n;j++){
                if(j != i && nums[j] < nums[i]){
                    count++;
                }
            }
            smallerNos[i] = count;
    }
    return smallerNos;
}
    
}
