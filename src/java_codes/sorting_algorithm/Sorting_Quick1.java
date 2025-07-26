package java_codes.sorting_algorithm;

import java.util.Arrays ;

// quick sort
// in place sorting algo - better approach
// can also be done by copying the array - not a good approach

public class Sorting_Quick1 {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);

        System.out.println( Arrays.toString(arr) );

    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return; // base case
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                // swap nums[s] and nums[e]
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;

                s++;
                e--;
            }
        }

        // recursively sort left and right parts
        sort(nums, low, e); // left of pivot
        sort(nums, s, high); // right of pivot

    }
}
