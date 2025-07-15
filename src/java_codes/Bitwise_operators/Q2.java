package java_codes.Bitwise_operators;

// find unique number in the array

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 3, 5 ,1 , 2, 3};
        System.out.println(search(arr));
    }

    public static int search( int[] arr){
        int unique = 0;

        for( int num : arr){
            unique ^= num;
        }

        return unique;
    }

}
