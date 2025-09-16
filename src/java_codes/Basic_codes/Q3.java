package java_codes.Basic_codes;

 // find whether a char is an alphabet , digit or a special char

import java.util.Scanner;

public class Q3 {
    public static void main( String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character :");
        char ch = sc.next().charAt(0);

        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(" alphabet ");
        }
        else if( ch >= '0' && ch <= '9'){
            System.out.println(" number ");
        }
        else{
            System.out.println("special character");
        }
    }
}
