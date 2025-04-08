package BinarySearch;

public class PeakIndex {
    public static void main(String[] args) {
        int [] arr = {0,1,2,4,5,8,3,2,1,0};
        System.out.println(peak(arr));
    }
    public  static int peak(int arr[]) {
        int start =0;
        int end =arr.length-1;

        while (start < end) {
         int mid = (start+end) /2;
         if(arr[mid] > arr[mid+1]) {
             end = mid;
         } else {
             start = mid+1;
         }
        }
      return arr[end];
    }
}
