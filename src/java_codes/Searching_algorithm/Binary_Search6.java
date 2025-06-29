package java_codes.Searching_algorithm;

// Given a rotated sorted array ( with duplicate values )
// return the minimum index at which the target is present
// within O(log n)complexity

public class Binary_Search6 {
    public static void main(String[] args) {
        int[] arr = { 1, 0 , 1, 1 , 1 };
        int target = 1;
        int ans = search( arr , target );
        System.out.println(ans);

    }
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;  // store the index
                end = mid - 1; // move left to find smaller index
            }
            // Cannot determine sorted half due to duplicates
            else if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            // Left half is sorted
            else if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return result;
    }

}
