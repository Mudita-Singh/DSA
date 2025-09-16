package java_codes.Basic_codes;

// count digits of a number

public class Q7 {
    public static void main( String[] args){
        int a = 15333;
        int count = 0;

        while( a != 0){
            a = a/10;
            count++;

        }

        System.out.println(count);
    }
}
