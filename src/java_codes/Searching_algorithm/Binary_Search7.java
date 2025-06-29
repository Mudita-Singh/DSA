package java_codes.Searching_algorithm;

// find rotation count in rotated sorted array ( without duplicate elements )
// the index of the minimum element in the array ( that is pivot + 1 index ) gives the number of times array has been rotated
// this is same as the code to calculate the minimum element in a rotated sorted array

public class Binary_Search7 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println( findRotationCount(arr) );
    }
    public static int findRotationCount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If middle element is less than the end, minimum is in left half (including mid)
            if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                // Minimum is in right half (excluding mid)
                start = mid + 1;
            }
        }

        return start; // start == end is the index of the smallest element
    }

}
