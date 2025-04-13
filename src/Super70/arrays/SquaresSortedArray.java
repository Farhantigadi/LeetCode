package Super70.arrays;

import java.util.Arrays;

//977. Squares of a Sorted Array
public class SquaresSortedArray {
    public static void main(String[] args) {
        int [] arr ={1,2,4,5,7,8};

        System.out.println(Arrays.toString(squareSort(arr)));

    }
    public static int[] squareSort(int[]arr) {
      int n = arr.length;
      //empty array
      int [] result = new int[n];
      int pos = n-1;
      int left = 0, right = n-1;


      while (left <= right) {
          int leftsquare = arr[left] * arr[left];
          int rightsquare = arr[right] * arr[right];
          if (leftsquare > rightsquare) {
              result[pos] = leftsquare;
              left++;
          } else {
              result[pos] = rightsquare;
              right--;
          }
          pos--;

          }
      return result;
      }

}
