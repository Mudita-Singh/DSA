package java_codes.Searching_algorithm;

// searching through an array
// ascending order of array
// binary search

public class Binary_Search1 {
    public static void main(String[] args) {
        int[] arr = { 1 , 2, 3, 4,5 };
        int target = 5;
        System.out.println(search(arr , target));

    }
    static int search( int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        while(start<= end) {
            int mid = start + (end -start)/2;
            if (target > arr[mid]) {
                start = mid + 1;
            }
            else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
