package Super70.arrays;

public class smallerThanCurrent {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 7, 8};
find(arr,8);
    }

    public static void find(int[] arr, int current) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < current) {
                System.out.print(arr[i]+" ");
            }
            }
        }
    }









