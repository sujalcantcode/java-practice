public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 10, 12,15, 19,21,23, 25, 27, 30, 32, 35, 40, 45, 50};
        int target = 15;
        int result = ans(arr, target);
        System.out.println("Element found at index: " + result);
    }
    public static int ans(int[] arr, int target) {

       int start = 0 , end = 1;
       while(target > arr[end]){
          int temp = end + 1;
          // end = prev end + size of box *2
          end = end + (end - start + 1) * 2; // double the range
          start = temp; // update start to the previous end + 1
       }
       return BinarySearch(arr, target, start, end);
    }
    public static int BinarySearch(int[] arr, int target, int start, int end){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                return mid; // Found the target, return the index
            }
            
        }
        return -1;
    }
}
