package java_codes.Recursion;

// print all the possible subsets of a string
// using ArrayList
// using recursion

import java.util.ArrayList;

public class Recursion25 {
    public static void main(String[] args) {

        System.out.println( subset("abc" , ""));
    }

    public static ArrayList<String> subset(String old , String stringNew){
        if(old.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(stringNew);
            return list;
        }

        ArrayList<String> left = subset( old.substring(1) , stringNew + old.charAt(0)); // write string first otherwise if you write old.charAt(0) first then it will treat it as int value
        ArrayList<String> right = subset(old.substring(1) , stringNew);

        left.addAll(right);
        return left;
    }
}
