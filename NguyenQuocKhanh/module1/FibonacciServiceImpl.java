public class FibonacciServiceImpl implements FibonacciService {

    @Override
    public int fibonacci(int n, boolean flag) {
        if (flag) {
            return fibonacciRecursive(n);
        }

        return fibonacciLoop(n);
    }

    private int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    private int fibonacciLoop(int n) {
        if (n <= 1) {
            return n;
        }

        int previous = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }
}