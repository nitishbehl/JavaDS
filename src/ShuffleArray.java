import java.util.Arrays;

//x1=2 x2=5  x3=1   y1=3  y2=4  y3=7
//x1 y1 x2 y2 x3 y3
//2 3 5 4 1 7
public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        for (int i = 0; i < 2 * n; i = i + 2) {
            result[i] = nums[i / 2];
        }

        for (int i = 1; i < 2 * n; i = i + 2) {
            result[i] = nums[n + (i / 2)];
        }

        return result;
    }


    public static void main(String[] args) {
        int n = 3;
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] result = shuffle(nums, 3);

        System.out.println(Arrays.toString(result));
    }
}
