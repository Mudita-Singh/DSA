package java_codes.Searching_algorithm;

// searching through an array
// linear search

public class Linear_Search1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        for (int array : arr) {
            if (array == target) {
                return array;
            }

//        for (int i = 0 ; i< arr.length; i++){
//            if(arr[i] == target){
//              return i;
//            }
//        }

        }
        return -1;

    }
}

