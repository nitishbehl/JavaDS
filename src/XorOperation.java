public class XorOperation {
    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + (2 * i);
        }
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int num = 5, start = 0;
        System.out.println(xorOperation(4, 3));
    }
}
