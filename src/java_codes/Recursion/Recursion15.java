package java_codes.Recursion;

// rotated binary search
// using recursion

public class Recursion15 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 1, 2, 3, 4, 5};
        int target = 5;
        System.out.println( find( arr , target , 0 , arr.length-1 ));
    }

    public static int find( int[] arr , int target , int start , int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return find(arr, target, start, mid - 1);
            } else {
                return find(arr, target, mid + 1, end);
            }
        } else {
            if (target > arr[mid] && target <= arr[end]) {
                return find(arr, target, mid + 1, end);
            } else {
                return find(arr, target, start, mid - 1);
            }
        }
    }
}
