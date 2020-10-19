public class squareSorted {
    public static void sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
            System.out.println(A[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        sortedSquares(arr);
    }
}


// to do sort after......
