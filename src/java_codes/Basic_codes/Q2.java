package java_codes.Basic_codes;

// reverse a string

public class Q2{
    public static void main( String args[]){
        String a = "mudita";

        char[] arr = a.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        swap(start , end , arr);

        String str = new String(arr);

        System.out.println( str );

    }

    public static void swap( int start , int end , char[] arr){
        while(start <= end){

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
