package BinarySearch;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

import java.util.Arrays;
import java.util.EnumSet;

public class InfiniteArray {
    public static void main(String[] args) {
        int nums [] ={ 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170,180,200,220,240,260,300,350,380,400,500,550,620,680,750,777};
        System.out.println(ans(nums,300));
    }
    static int ans(int [] nums,int target) {
int start =0;
int end =1;
while (target>nums[end]){
    //here start is not used beacuse in the next step we need to have the previous start value
    int newstart = end+1;
    //end = previous end + size of current box * 2
    // here +1 bcz ,suppose strat and end are at same position, we need to find size of the box so s-end will be 0 but there is one element  therefore +1 is added
    end = end + (end - start +1) *2;
    start = newstart;
}
return  binarysearch(nums,target,start,end);
    }
    static int binarysearch(int[] nums,int target,int start,int end) {

        while (start <=  end) {
            int mid =(start+end)/2;
            if(nums[mid] > target) {
                end = mid -1;
            } else if (nums[mid] < target) {
                start=mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

