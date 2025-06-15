import java.util.*;

class ArrayListTCS {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {5, 2, 2},
                {7, 8}
        };

        List<int[]> positions = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 2) {
              positions.add(new int[]{i,j}); // Store the (i,j) position
                }
            }
        }

        // Print all positions
        for (int[] pos : positions) {
            System.out.println("2 found at: (" + pos[0] + ", " + pos[1] + ")");
        }
    }
}

