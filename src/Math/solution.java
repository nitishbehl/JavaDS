package Math;

public class solution {
    public static int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while (n > 0) {
            sum = sum + n % 10;
            product = product * (n % 10);
            n = n / 10;
        }
        return product - sum;

    }

    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }
}
