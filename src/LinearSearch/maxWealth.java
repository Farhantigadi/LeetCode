package LinearSearch;

public class maxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {100, 2, 3},
                {4, 5, 6},
                {44,2,4}
        };
        int ans =0;
        for (int i = 0; i < arr.length ; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }

        }
        System.out.println(ans);

    }
}
