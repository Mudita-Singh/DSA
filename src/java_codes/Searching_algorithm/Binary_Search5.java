package java_codes.Searching_algorithm;

// searching an element in an infinite array

public class Binary_Search5 {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 3 , 4, 5 , 6, 7 , 8, 9, 10 , 11 , 12 , 13 , 14, 15}; // array size not known
        int target = 14;
        int start = 0; // initial start
        int end = 1; // initial end
        int ans = search1(arr , target , start , end);
        System.out.println(ans);

    }
    public static int search1(int[] arr , int target , int start , int end){
        while( target > arr[end]){
            int oldstart = start;
            start = end + 1;
            end = end + ( end - oldstart + 1) * 2 ; // doubling search space each time
        }
        int ans2 = search2(arr , target , start , end);
        return ans2;
    }

    public static int search2( int[] arr , int target , int start , int end){
        while(start <= end){
            int mid = start + ( end - start)/2;
            if( target == arr[mid]){
                return mid;
            }
            else if( target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }


}
