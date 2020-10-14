import java.util.ArrayList;
import java.util.List;

public class luckyNumber {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            int minValue = matrix[i][0];
            int minIndex = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (minValue > matrix[i][j]) {
                    minValue = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean isLucky = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > minValue) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                result.add(minValue);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };
        result = luckyNumbers(matrix);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
