package java_codes.Recursion;

import java.util.Arrays;

// selection sort
// using recursion

public class Recursion19 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2};
        selection(arr, arr.length, 0, 0);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    // Recursive Selection Sort using i (outer loop) and j (inner loop)
    static void selection(int[] arr, int i, int j, int maxIndex) {
        if (i == 0) {
            return; // base case: sorting done
        }

        if (j < i) {
            if (arr[j] > arr[maxIndex]) {
                selection(arr, i, j + 1, j); // update max index
            } else {
                selection(arr, i, j + 1, maxIndex); // keep current max
            }
        } else {
            // One pass done: swap max element to its correct position
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i - 1];
            arr[i - 1] = temp;

            // repeat for the remaining part of the array
            selection(arr, i - 1, 0, 0);
        }
    }
}
