public class minimumAbsoluteDifference {
    public static int minimumAbsDifference(int[] arr) {
        int result;
        int count = 0;
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            result = Math.abs(arr[i] - arr[i + 1]);
            if (minDifference > result) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3};
        System.out.println(minimumAbsDifference(arr));

    }
}
