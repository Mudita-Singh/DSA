package java_codes.Basic_codes;

// find whether a number is even or odd

public class Q5 {
    public static void main(String[] args){

        int num = 10 ;

        System.out.println(find1(num));
        System.out.println(find2(num));
    }

    public static boolean find1(int num){
        return num % 2 == 0 ;
    }

    public static boolean find2(int num){
        return (num & 1) == 0;

    }
}
