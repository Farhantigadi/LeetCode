package Super70.arrays;

public class reverseString {
    public static void main(String[] args) {
        String str = "farhan";
        String reverese = "";
        for (int i = str.length()-1; i>=0; i--) {
            reverese = reverese+ str.charAt(i);
        }
        System.out.println(reverese);
    }
}
