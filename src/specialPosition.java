import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;

public class specialPosition {
    public static int numSpecial(int[][] mat) {
        int[] row = new int[mat[0].length];
        int[] column = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    row[i]++;
                    column[j]++;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && row[i] == 1 && column[j] == 1) {
                    result++;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        int[][] mat = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        result = singletonList(numSpecial(mat));
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
