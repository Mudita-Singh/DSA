package java_codes.Searching_algorithm;

public class Linear_Search3 {
    public static void main(String[] args) {
        int[] arr = { 1 , 2, 3, 4};
        int start = 1;
        int  end = 3;
        int target = 3 ;
        System.out.println(search(arr , target , start , end));
    }
    static int search(int[] arr , int target , int start , int end){
        for(int i = start ; i <= end ; i++){
            if(arr[i] == target){
                return i ;
            }
        }
        return -1;
    }
}
