package array;

public class faboniciiNumber {
    public static int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1 || N == 2) {
            return 1;
        }
        return fib(N - 2) + fib(N - 1);

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i) + "");
        }
    }
}
