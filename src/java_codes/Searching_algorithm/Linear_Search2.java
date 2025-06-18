package java_codes.Searching_algorithm;

// searching through a string
//linear search

public class Linear_Search2 {
    public static void main(String[] args) {
        String name = "Mudita";
        char target ='u';
        char ans = search(name , target );
        System.out.println(ans);
    }
    static char search( String name , char target){


        //// Approach one with normal for loop

//        for ( int i = 0 ; i<name.length() ; i++){ //// used a string method not array
//            if( target == name.charAt(i)){
//                return name.charAt(i);
//            }
//        }

        //// Approach 2 with enhanced loop
        for ( char a : name.toCharArray()){
            if( a == target){
                return a;
            }
        }
        return '\0';
    }


}

