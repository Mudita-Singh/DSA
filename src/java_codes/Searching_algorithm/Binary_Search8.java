package java_codes.Searching_algorithm;

// find rotation count in rotated sorted array ( with duplicate elements )
// the index of the minimum element in the array ( that is pivot + 1 index ) gives the number of times array has been rotated
// this is same as the code to calculate the minimum element in a rotated sorted array

public class Binary_Search8 {
        public static void main(String[] args) {
            int[] arr = {2, 2, 2, 3, 4, 0, 0 , 1, 2};
            System.out.println(findRotationCount(arr));
        }

        public static int findRotationCount(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] < arr[end]) {
                    end = mid;
                } else if (arr[mid] > arr[end]) {
                    start = mid + 1;
                } else {
                    // arr[mid] == arr[end] → reduce search space
                    end--;
                }
            }

            return start; // index of the smallest element = rotation count
        }

    }
