public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 10, 12, 15, 19, 21, 23, 25, 27, 30, 32, 35, 40, 45, 50};
        int target = 15;
        int result = binarySearch(arr, target);
        System.out.println("Element found at index: " + result);
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid; // Found the target
            }
        }
        return -1; // Target not found
    }
}
