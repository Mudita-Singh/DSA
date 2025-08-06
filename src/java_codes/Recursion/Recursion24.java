package java_codes.Recursion;

// print all the possible subsets of a string
// using recursion

import java.util.ArrayList;

public class Recursion24 {
    public static void main(String[] args) {

        subset("abc" , "");
    }

    public static void subset(String old , String stringNew){
        if(old.isEmpty()){
            System.out.println(stringNew);
            return ;
        }

         subset( old.substring(1) , stringNew + old.charAt(0)); // write string first otherwise if you write old.charAt(0) first then it will treat it as int value
         subset(old.substring(1) , stringNew);

    }
}
