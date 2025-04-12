package Super70.arrays;

public class missingNumber {
    public static void main(String[] args) {
        int arr[] = {0,1,3,4,5};

     int actualsum =0;
     int n = arr.length;

     int sum = n *(n+1)/2;
        for (int i = 0; i < arr.length; i++) {
           actualsum += arr[i];
        }
        int ans = sum - actualsum;
        System.out.println(ans);
    }

}
