package Super70.arrays;

import java.util.Arrays;

class pushZeroes{
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,4,0,1};
        int n = arr.length-1;
        int pos = n-1;
        int start =0;
        int result[] =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                result[pos] = arr[i];
                pos--;
            } else {
                result[start] = arr[i];
                start++;
            }

        }
        System.out.println(Arrays.toString(result));
    }
}