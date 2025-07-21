package java_codes.Bitwise_operators;

// find the total number of digits in a number

public class Q4 {
    public static void main(String[] args) {
        int num = 6;
        int base = 10;
        search( num );

       int ans = ((int)(Math.log(num) / Math.log(base))) + 1 ;  // formula
       System.out.println( ans );

    }
    public static void search(int num ){

        int count = 0;    // works for binary base
        while(num != 0){
            count++;
            num = num >> 1;
        }

        System.out.println(count);
    }

}
