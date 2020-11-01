package array;

//https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
public class songDuration {
    public static int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            for (int j = i + 1; j < time.length; j++) {
                if (i < j && time[i] + time[j] % 60 == 0) {
                    count = count + 1;
                }
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {30, 20, 150, 100, 40};
        System.out.println(numPairsDivisibleBy60(arr));

    }
}
