package java_codes.Bitwise_operators;

import java.util.Scanner;

// check whether number is odd or even

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        odd(num);
    }

    public static void odd( int num){
        if((num & 1) == 1){
            System.out.println("odd number");
        }else{
            System.out.println("even number");
        }
    }
}
