package java_codes.Recursion;

// linear search using recursion

public class Recursion11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 4;

        System.out.println( find1(arr , target , 0));
        System.out.println( find2(arr , target , 0));
    }

    public static boolean find1( int[] arr , int target , int idx ){
        if( idx == arr.length - 1){
            return false;
        }

        return arr[idx]==target || find1(arr , target , idx+1);
    }

    public static int find2( int[] arr , int target , int idx){
        if( idx == arr.length - 1){
            return -1;
        }
        if( arr[idx] == target ){
            return idx ;
        }
        else{
            return find2(arr , target ,++idx);
        }
    }
}
