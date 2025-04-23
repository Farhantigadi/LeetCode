import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        boolean result = issPallindrome("pip");
        System.out.println(result);
    }
    static boolean issPallindrome(String s){
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int left =0;
        int right =s.length()-1;
        while (left<right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;


    }
}