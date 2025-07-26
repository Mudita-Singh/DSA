package java_codes.sorting_algorithm;

import java.util.Arrays;

// merge sort
// in place

public class Sorting_Merge2 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);  // now we pass (0 to 4), both inclusive
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return; // only one element
        }

        int mid = (start + end) / 2;

        sort(arr, start, mid);        // Left part: inclusive
        sort(arr, mid + 1, end);      // Right part: inclusive

        merge(arr, start, mid, end);  // merge two parts
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1]; // both inclusive, so +1

        int i = start;     // pointer for left half
        int j = mid + 1;   // pointer for right half
        int k = 0;         // pointer for mix array

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        // copy remaining from left half
        while (i <= mid) {
            mix[k++] = arr[i++];
        }

        // copy remaining from right half
        while (j <= end) {
            mix[k++] = arr[j++];
        }

        // copy back to original array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}
