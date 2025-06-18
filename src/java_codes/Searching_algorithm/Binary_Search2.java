package java_codes.Searching_algorithm;

// Order-Agnostic Binary Search

public class Binary_Search2 {
    public static void main(String[] args) {
        int[] arr = { -1 , -2, -3, -4, -5};
        int target = -4;
        System.out.println(search( arr , target));
    }

    static int search( int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[end]> arr[start];
        while(start <= end){
            int mid = start + ( end - start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            else if(isAsc == true){
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }

            }
            else{
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                else{
                    end = mid-1;
                }

            }

        }
        return -1;
    }
}
