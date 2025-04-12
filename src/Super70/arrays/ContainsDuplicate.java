package Super70.arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] arr ={1,2,5,4,7};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <i; j++) {
                if (arr[i]==arr[j]) {
                    return true;
                }

            }
        }
        return false;
    }

}
