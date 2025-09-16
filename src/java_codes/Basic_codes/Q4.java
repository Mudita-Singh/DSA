package java_codes.Basic_codes;

//  convert decimal to binary

public class Q4 {
    public static void main (String[] args){
        int num = 10;

        if( num == 0){
            System.out.println(0);
        }

        StringBuilder str = new StringBuilder();

        while( num > 0 ){

            int remainder = num % 2;
            str.append(remainder);
            num = num / 2;

        }

        str.reverse();
        System.out.println(str);
    }
}
