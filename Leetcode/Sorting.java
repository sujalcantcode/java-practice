
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 0, -27};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
static void selectionSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
        int last = arr.length - i - 1;
        int maxIndex = getMaxIndex(arr, 0, last);
        // Swap the found maximum element with the last element
        swap(arr, maxIndex, last);
    }
}
static int getMaxIndex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
        if (arr[i] > arr[max]) {
            max = i;
        }
    }
    return max;
}
    
// Bubble sort function
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Stable: Yes
static void BubbleSort(int  arr[]){
    boolean swapped = false;
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = 1; j <= arr.length-i-1; j++) {
            if(arr[j-1]>arr[j]){
                // swap arr[j-1] and arr[j]
                swap(arr, j-1, j);
                swapped = true;
            }
            }
            if(!swapped) break;
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

