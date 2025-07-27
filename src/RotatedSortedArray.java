public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,6,7,9,12,1,2,3};
        int target = 12;
        int result = search(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
            return;
        }
        int rotationCount = rotationCount(arr);
        System.out.println("Element found at index: " + result);
        System.out.println("Array is rotated " + rotationCount + " times.");
    }
    static int rotationCount(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1; // Number of rotations is pivot index + 1
    }
    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        // If target is greater than or equal to first element, search in left side
        else if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot);
        }
        // Otherwise search in right side
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    static int findPivotWithDuplicates(int[] arr){
    int start = 0, end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        // Check for pivot
        if (mid < end && arr[mid] > arr[mid + 1]) return mid;
        if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;

        // Handle duplicates
        if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
            // if start is pivot
            if (start < end && arr[start] > arr[start + 1]) return start;
            // if end is pivot
            if (end > start && arr[end] < arr[end - 1]) return end - 1;
            start++;
            end--;
        }
        // Deciding direction
        // If mid is greater than start or end, search in right side
        else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
            start = mid + 1;
        } 
        // If mid is less than start or end, search in left side
        else {
            end = mid - 1;
        }
    }
    return -1;
}
    static int findPivot(int[] arr){
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if  (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            } else if (arr[start] > arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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


