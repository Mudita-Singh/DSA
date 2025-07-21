package java_codes.Bitwise_operators;

// find whether a number is in powers of 2

public class Q6 {
    public static void main(String[] args) {
        int num = 15 ;

        // method 1 using & operator
        if((num & (num-1)) == 0)
            System.out.println("true");
        else
            System.out.println("false");

        // method 2
        search(num);

    }

    public static void search( int num ){
       int count  = 0;
       while(num != 0){
           if ((num & 1) == 1) {
               count++;
           }
           num = num >> 1;
       }

       if(count == 1)
           System.out.println("true");
       else
           System.out.println("false");
    }
}

