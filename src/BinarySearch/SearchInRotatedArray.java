package BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int arr[] ={10,11,13,1,2,5,8,9};
        System.out.println(searchpivot(arr));
    }
    public static int searchpivot(int []arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
               return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
    public static int findtarget(int[]arr,int target){
        int pivot = searchpivot(arr);

        int start =0;
     int  end = pivot;
     while(start<end){
         int mid = (start+end)/2;
         if (arr[mid]>target){
             end = mid-1;
         } else if (arr[mid]<target) {
             start=mid+1;
         } else {
             return mid;
         }
     }

     return -1;

    }
}
