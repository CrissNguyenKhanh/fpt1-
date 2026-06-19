public class FibonacciServiceImpl implements FibonacciService {

    @Override
    public int fibonacci(int n, boolean flag) {
        if (flag) {
            return fibonacciRecursive(n);
        }

        return 0;
    }

    private int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}