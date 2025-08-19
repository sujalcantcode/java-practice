
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    
// Bubble sort function
static void Bubble(int  arr[]){
    boolean swapped = false;
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = 1; j <= arr.length-i-1; j++) {
            if(arr[j-1]>arr[j]){
                // swap arr[j-1] and arr[j]
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                swapped = true;
            }
            }
            if(!swapped) break;
        }
    }
}

