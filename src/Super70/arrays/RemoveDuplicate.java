package Super70.arrays;

class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 4, 2, 8, 57, 7, 8, 1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            boolean isduplicate = false;
            for (int j = 0; j <i; j++) {
                if (arr[i]==arr[j]) {
                    isduplicate = true;
                    break;
                }
            }
            if (!isduplicate) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
