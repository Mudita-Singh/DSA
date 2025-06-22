package java_codes.Searching_algorithm;

// Ceiling of a number
// smallest number greater than or equal to the target

public class Binary_Search3 {
    public static void main(String[] args) {
        int[] arr = { 12 , 13 , 14, 16 ,17 , 28 , 22 , 23};
        int target = 19;
        int ans = search( arr , target);
        System.out.println(ans);

    }
    static int search( int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(end >= start ){
            int mid = start +( end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }
            else if(target >= arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }

        }
        return arr[start];
    }


}
