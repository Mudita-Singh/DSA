package java_codes.Recursion;

// find if an array is sorted

public class Recursion10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,6,7};
        System.out.println( find(arr , 0));
    }

    public static boolean find(int[] arr , int idx){
        if(idx == arr.length - 1){
            return true;
        }

        return arr[idx] < arr[idx+1] && find(arr , idx+1);
    }

}
