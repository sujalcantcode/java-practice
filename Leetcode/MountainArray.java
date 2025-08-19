// 1095. Find in Mountain Array
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2}; // Example mountain array
        int target = 4; // Example target value

        int peak = findPeakElement(arr);
        int ans = BinarySearch(arr, target, 0, peak, true);
        if (ans != -1) {
            System.out.println(ans);
        } else {
            int result = BinarySearch(arr, target, peak + 1, arr.length - 1, false);
            System.out.println(result);
        }
    }

static int findPeakElement(int[] arr) {
    int start = 0, end = arr.length - 1;

    while (start < end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] > arr[mid + 1]) {
            end = mid;
        } else {
            start = mid + 1;
        }
    }
    return start;
}

static int BinarySearch(int[] arr, int target, int start, int end, boolean isAsc) {
    while (start <= end) {
        int mid = start + (end - start) / 2;
        int midValue = arr[mid];
        if (midValue == target) {
            return mid;
        }
        if (isAsc) {
            if (midValue < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } else {
            if (midValue < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
    return -1;
}
}