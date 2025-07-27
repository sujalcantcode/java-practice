public class CeilFloor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 10, 12, 19};
        int target = 5;

        int ceil = ceil(arr, target);
        int floor = floor(arr, target);

        System.out.println("Ceil: " + ceil);
        System.out.println("Floor: " + floor);
    }

    /**
     * Finds the smallest element in the sorted array that is greater than or equal to the target.
     * If no such element exists, returns -1.
     *
     * @param arr    A sorted array of integers (ascending order).
     * @param target The target value to find the ceil for.
     * @return The ceil value if it exists, otherwise -1.
     */
    public static int ceil(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start >= arr.length) {
            return -1; // No ceil exists
        }
        return arr[start];
    }

    /**
     * Finds the floor of the target in a sorted array.
     * The floor is the greatest element less than or equal to the target.
     * Returns -1 if no such element exists (i.e., all elements are greater than the target).
     *
     * @param arr Sorted array of integers.
     * @param target The target value to find the floor for.
     * @return The floor value or -1 if no floor exists.
     */
    public static int floor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (end < 0) {
            return -1; // No floor exists
        }
        return arr[end];
    }
}
