package LinearSearch;

public class evenDigits {
    public static void main(String[] args) {
        int arr[] = {1,22,254,65,78,5,22,88,7,222};
        System.out.println(find(arr));

    }
    static int find(int [] arr ) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if (even(arr[i])){
               count++;
           }
        }
        return count;
    }

     static boolean even(int i) {
        int count =0;
        while(i > 0) {
            i = i/10;
            count++;
        }
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }
}
