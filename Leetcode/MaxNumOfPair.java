
import java.util.HashMap;

public class MaxNumOfPair {
    // 2347. Maximum Number of Pairs in Array
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 3}; // Example input
        int[] result = maxNumOfPairs(nums);
        System.out.println("Max pairs: " + result[0] + ", Remaining elements: " + result[1]);
    }
    // Approach: Optimized
    public static int[] optimized(int[] nums) {
        int[] freq = new int[101]; // Assuming nums[i] in [0,100]
        for (int num : nums) freq[num]++;
        int pairs = 0;
        int remaining = 0;
        for (int count : freq) {
            pairs += count / 2;
            remaining += count % 2;
        }
        return new int[]{pairs, remaining};

    }
    // Approach: Count Pairs
    // This method counts the maximum number of pairs and remaining elements in the array.

    public static int[] maxNumOfPairs(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int pairs = 0;
        int remaining = 0;

        for (int count : countMap.values()) {
            pairs += count / 2;
            remaining += count % 2;
        }

        return new int[]{pairs, remaining};
    }
    
}
