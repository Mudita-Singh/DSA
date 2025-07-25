package java_codes.Recursion;

// binary search using recursion

public class Recursion2 {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3, 4, 5, 6};
        int target = 3;
        int ans = search(arr , target , 0 , arr.length-1 );
        System.out.println(ans);
    }

    public static int search( int[] arr , int target , int start , int end){
        if(start > end){
            return -1 ;
        }

        int mid = start + (end - start)/2;
        if( arr[mid]==target){
            return mid ;
        }
        if( target > mid){
            return search( arr , target , mid+1 , end);
        }
        else{
            return search( arr , target , start , mid-1);
        }

    }

}
