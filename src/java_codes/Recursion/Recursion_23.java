package java_codes.Recursion;

// given a string , skip a substring "app" only if it's not "apple"
// using recursion

public class Recursion_23 {
    public static void main(String[] args) {
        System.out.println(skip("bapploccad")); // skip "app" if it's not "apple"
    }

    public static String skip(String old){
        if(old.isEmpty()){
            return "";
        }

        if( old.startsWith("app") && !old.startsWith("apple")){
            return skip(old.substring(3));
        }
        else{
           return old.charAt(0) + skip(old.substring(1));
        }
    }
}
