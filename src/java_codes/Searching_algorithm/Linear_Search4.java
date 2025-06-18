package java_codes.Searching_algorithm;

public class Linear_Search4 {
    public static void main(String[] args) {
        int[] arr = { 6 , 1 , 2, 3, 4 ,5 ,};
        System.out.println(search(arr));
    }
    static int search( int[] arr){
        int min = arr[0];
        for ( int i = 0 ; i< arr.length ; i++){
            if( arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
